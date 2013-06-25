package com.qsoft.common;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/25/13
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student
{
    private Integer age;
    private String name;

    @Required
    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Integer getAge()
    {
        return this.age;
    }

    @Required
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
