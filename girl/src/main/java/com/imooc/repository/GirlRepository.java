package com.imooc.repository;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by daime on 2017/11/18.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄查询
    List<Girl> findByAge(Integer age);
}
