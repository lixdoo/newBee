package com.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.server.StaffService;



/**
 * Created by csw on 2015/10/30.
 */
public class ServiceUtil {

    public static StaffService publicService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        return (StaffService) context.getBean("staffService");
    }
}
