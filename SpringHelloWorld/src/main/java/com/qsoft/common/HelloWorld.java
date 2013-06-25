package com.qsoft.common;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/25/13
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public void sprintHello()
    {
        System.out.println("Hello !" + name);
    }
}
