package com.qsoft.dao.Impl;

import com.qsoft.dao.ModelDAO;
import com.qsoft.model.MachineEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 6/26/13
 * Time: 6:49 AM
 * To change this template use File | Settings | File Templates.
 */


@Transactional
public class ModelDAOImpl implements ModelDAO
{
    //private HibernateTemplate hibernateTemplate;
    @Autowired
    EntityManager entityManager;

    @Override
    public void createModel(MachineEntity machineEntity)
    {
        entityManager.persist(machineEntity);
        entityManager.flush();
        entityManager.getTransaction().isActive();
    }

    @Override
    public void updateModel(MachineEntity machineEntity)
    {

    }

    @Override
    public void deleteModel(MachineEntity machineEntity)
    {

    }

    @Override
    public void findModel()
    {

    }
}
