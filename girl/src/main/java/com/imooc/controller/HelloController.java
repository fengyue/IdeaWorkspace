package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by daime on 2017/11/18.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value= "/say/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id: " + id;
//        return girlProperties.getCupSize();
        //return content;
        //return cupSize + age;
    }

    @GetMapping(value="date1.do")
    public String date1(@RequestParam("date1") Date date1) {
        return date1.toString();
    }

//    @InitBinder("date1")
//    public void initDate1(WebDataBinder binder) {
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
//    }
}
