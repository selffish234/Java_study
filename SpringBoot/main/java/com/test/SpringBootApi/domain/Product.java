package com.test.SpringBootApi.domain;

import javax.persistence.*;

@Entity // jpa가 product 라고 하는 객체를 인식해서 사용할 준비를 함 // '@어노테이션' 이라고 합니다
@Table(name="products") // 표의 이름 정하기
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "product_name")
   private  String productName;

   @Column(name = "price")
   private int price;

   public Product() {}
   public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
