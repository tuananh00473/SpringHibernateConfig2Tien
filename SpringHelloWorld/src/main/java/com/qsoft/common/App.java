package com.qsoft.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/25/13
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class App
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        for (int i = 1; i <= 6; i++)
        {
            HelloWorld obj = (HelloWorld) context.getBean("helloBean" + i);
            obj.setName("anhnt");
            obj.sprintHello();
            HelloWorld obj2 = (HelloWorld) context.getBean("helloBean" + i);
            obj2.sprintHello();
            obj2.setName("New Anhnt");
            obj.sprintHello();
            obj2.sprintHello();
        }
    }
}
