package com.test.SpringBootApi.controller;

import com.test.SpringBootApi.service.ProductServiceImpl;
import com.test.SpringBootApi.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*") // 요청의 주체가 특정 도메인을 제한하는 기능
@RestController // 사용자 입력을 http 방식의 경로 규칙에 맞게 호출을하면 거기에 맞게 서비스를 호출하도록 구성이됨
@RequestMapping("/api") // 어떤 경로로 사용자의 입력을 받을지
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/products/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") long id) {

        try {
            return ResponseEntity.ok(productService.findById(id)); // ResponseEntity는 응답받았을때 하나의 객체
            //ok는 정상적으로 Http 메소드가 호출됐다는것
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) { // requestbody: 실제로 프로덕트를 만들기 위한 데이터를 전달하는 부분
        try {
            ResponseEntity
                    .status(HttpStatus.CREATED) // httpStatus: 정상적으로 처리됐는지 안됐는지 http통신에서 결과물들을 보여주는 부분
                    .body(productService.save(product)); // 입력받은 데이터를 productService로 넘겨줌
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable("id") long id, // PathVariable은 주소옆에 붙는 id값을 뭐로 할것인가
            @RequestBody Product product
    ) {
        try {
            ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(productService.update(id, product));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id") long id) {
        try {
            productService.delete(id); // productService에서 delete(id)하고
            ResponseEntity.noContent(); // 삭제 했으면 콘텐츠 없다는 것을 보여주어라
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
