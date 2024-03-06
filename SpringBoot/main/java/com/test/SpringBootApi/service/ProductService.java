package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;

import java.util.Optional;

public interface ProductService {

    public Product save(Product product);
    public Optional<Product> findById(Long id); // Null 이라고 하는 값을 조회할 때 대응할 수 있는 객체
    public Product update(Long id, Product product); // 고유의 값으로 객체를 찾은 후 새로 입혁한 값으로 뒤집어 쓰게끔 함
    public void delete(Long id); // 고유의 값을 삭제 후 특정값 반환 X

}
// 구체적인 구현부가 없는 반환타입, 이름 , 파라미터만 정의됨
// 실제로 데이터를 처리하는것이 SpringBoot 에서는 서비스 파트에서 조작이된다.
// 어떤 식으로 조작해서 데이터베이스로 넘겨줄지를 결정함 , 변환 & 가공의 과정
