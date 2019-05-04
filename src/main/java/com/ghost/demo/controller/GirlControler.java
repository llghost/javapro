package com.ghost.demo.controller;

import com.ghost.demo.domain.Girl;
import com.ghost.demo.repository.GirlRepository;
import com.ghost.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;
@RestController
public class GirlControler {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public  List<Girl> getall(){
       return  girlRepository.findAll();
    }
    /*
     添加一个女孩
     */
    @PostMapping(value="addgirls")
    public  Girl addGirl(@RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age ){

        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /*
 修改一个女孩
 */
    @PutMapping(value="girls/{id}")
    public  Girl updateGirl(@PathVariable("id") Integer id,
                         @RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age ){

        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }
    @GetMapping(value = "/girls/{id}")
    public Girl findOne(@PathVariable("id") Integer id){
       return  girlRepository.findById(id).get();
    }

    @DeleteMapping(value = "/girls/{id}")
    public void DeleteOne(@PathVariable("id") Integer id){
          girlRepository.deleteById(id);
    }

    @GetMapping("/girls/age/{age}")
    public  List<Girl> findByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public  void girlTwo(){
         girlService.insertTwo();
    }

}
