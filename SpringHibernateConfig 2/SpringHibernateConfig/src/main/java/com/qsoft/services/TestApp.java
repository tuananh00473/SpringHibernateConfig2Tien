package com.qsoft.services;

import com.qsoft.dao.ModelDAO;
import com.qsoft.model.MachineEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 6/26/13
 * Time: 7:02 AM
 * To change this template use File | Settings | File Templates.
 */

public class TestApp
{

    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "spring-config.xml");

        MachineEntity machineModel1 = new MachineEntity();
        machineModel1.setMachineCode("123");
        machineModel1.setMachineDescription("xxx");

        MachineEntity machineModel2 = new MachineEntity();
        machineModel2.setMachineCode("12345");
        machineModel2.setMachineDescription("xxxxxx");

        ModelDAO modelDAO = (ModelDAO) applicationContext.getBean("ModelDAO");
        modelDAO.createModel(machineModel1);
        modelDAO.createModel(machineModel2);

//        machineModel2.setMachineCode("123");
//        modelDAO.updateModel(machineModel2);

       // modelDAO.findModel();
    }
}
