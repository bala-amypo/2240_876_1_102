package com.example.demo.entity;

import jakarta.presistence.*;

public class Product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
    private String modelNumber;
    private String category;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getModelNumber(){
        return modelNumber;
    }
    public void setModelNumber(String modelNumber){
        this.modelNumber=modelNumber;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;    
    }
    public Product(String name,String email,String modelNumber,String category){
        this.name=name;
        this.email=email;
        this.modelNumber=modelNumber;
        this.category=category;
    }
}