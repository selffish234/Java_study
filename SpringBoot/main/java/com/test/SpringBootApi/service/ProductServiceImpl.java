package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        try { // 예기치 못한 상황에 있어서 예외를 적절히 처리하는것이 안정적인 프로그램을 구성할 수 있기 때문
            return productRepository.save(
                    new Product(
                            product.getProductName(),
                            product.getPrice()
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        try {
            Optional<Product> productData = productRepository.findById(id); // productRepository에서 id 를 통해 findById 실시
            if (productData.isPresent()) { // isPresent() 조회한 데이터가 존재하는지
                return productData; // 있으면 return 하기
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product update(Long id, Product product) {

        try {
            Optional<Product> productData = productRepository.findById(id); // 특정 객체를 조회하기 위해서는 optional 이라는 객체활용
            if (productData.isPresent()) {
                Product _product = productData.get(); // _product 는 새로 덮어쓴 데이터, 구데이터를 신데이터에 덮어씀
                _product.setProductName(product.getProductName()); // 사용자로부터 입력받은 값을 _product에 할당
                _product.setPrice(product.getPrice()); // 사용자로부터 입력받은값을 _product에 할당
                productRepository.save(_product); // 레포지토리에 데이터 넘겨서 세이브
                return _product;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(Long id) { // 고유의 ID값을 찾고 그것을 삭제하면 됨
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
