package com.jm.ssm_based_on_gradle.convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/18/2018
 * Time: 11:00 AM
 */

public class DateFormatter implements Formatter<Date> {
    private SimpleDateFormat simpleDateFormat;
    private String datePattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.parse(text);
    }

    @Override
    public String print(Date object, Locale locale) {
        return new SimpleDateFormat().format(object);
    }
}
