package com.imooc.common;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by daime on 2017/11/21.
 */
@Service
public class MyDateConverter implements Converter<String,Date> {

    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
