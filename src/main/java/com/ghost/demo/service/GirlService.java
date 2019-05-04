package com.ghost.demo.service;

import com.ghost.demo.repository.GirlRepository;
import com.ghost.demo.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girla=new Girl();
        girla.setCupSize("A");
        girla.setAge(18);
        girlRepository.save(girla);

        Girl girlb=new Girl();
        girlb.setCupSize("Bbbb");
        girlb.setAge(19);
        girlRepository.save(girlb);
    }
}
