package com.qsoft.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/25/13
 * Time: 4:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainApp
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("name : " + student.getName());
        System.out.println("age : " + student.getAge());
    }
}
