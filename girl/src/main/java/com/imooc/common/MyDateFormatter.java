package com.imooc.common;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.aspectj.bridge.Version.text;

/**
 * Created by daime on 2017/11/21.
 */
//@Service
public class MyDateFormatter implements Formatter<Date> {

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return null;
    }
}
