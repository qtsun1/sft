package com.services.springmvc.csedemo;

import com.services.springmvc.csedemo.model.Person;

import org.springframework.web.multipart.MultipartFile;

public interface Csedemo {

    Integer add(Integer a,Integer b);


    String sayHei( String name);


    String sayHello(String name);


    String sayHi(String name);


    String saySomething(String prefix,Person user);

}