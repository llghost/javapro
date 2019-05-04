package com.ghost.demo.controller;

import com.ghost.demo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloControler {

//    @Value("${cupSize}")
//    private String cupSize;
//    @Value("${age}")
//    private Integer age;
//    @Value("${content}")
//    private  String content;
    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = "/say",method = RequestMethod.GET)
     @GetMapping(value = "/say/{id}")
    //http://127.0.0.1:8081/hello/say?id=10  获取后面的参数
   //public String say(@RequestParam(value ="id" ,defaultValue ="0") Integer id){
     public String say(@PathVariable("id") Integer id){
       //return "hello spring";
//        return cupSize + age +contentt
       // return girlProperties.getCupSize()+girlProperties.getAge();
        return "id"+id;
   }
}
