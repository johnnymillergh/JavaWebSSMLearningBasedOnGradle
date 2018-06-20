package com.jm.ssm_based_on_gradle.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/18/2018
 * Time: 10:32 AM
 */

public class DateConverter implements Converter<String, Date> {
    private String datePattern = "yyy-MM-dd HH:mm:ss";

    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid argument");
        }
    }
}
