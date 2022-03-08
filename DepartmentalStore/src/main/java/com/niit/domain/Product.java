package com.niit.domain;

public class Product {
    private int ProductId;
    private String name;
    private String email;

    public Product(){
    }

    public Product(int ProductId, String name, String email){
        this.ProductId = ProductId;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
