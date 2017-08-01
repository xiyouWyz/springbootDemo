package com.xiaoyou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiaoyou.wyz on 2017/8/1.
 */
@Service
public class GirlService {
    @Autowired
    private  GirlRepository girlRepository;
    @Transactional
    public void insertTwo(){
        Girl girl=new Girl();
        girl.setAge(20);
        girl.setCupSize("A");
        girlRepository.save(girl);

        Girl girl1=new Girl();
        girl1.setAge(21);
        girl1.setCupSize("BBB");
        girlRepository.save(girl1);

    }
}
