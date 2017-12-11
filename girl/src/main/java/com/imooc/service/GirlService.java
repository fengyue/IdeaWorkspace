package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by daime on 2017/11/18.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setAge(18);
        girlA.setCupSize("A");
        girlA.setMoney(120d);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(22);
        girlB.setCupSize("DA");
        girlB.setMoney(51.3);
        girlRepository.save(girlB);
    }

    /**
     *
     * @param id
     * @throws Exception
     */
    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            //返回“你还在上小学”
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age >= 10 && age < 16) {
            //返回“你可能在上初中”
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }
}
