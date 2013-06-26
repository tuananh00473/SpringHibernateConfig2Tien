package com.qsoft.dao;

import com.qsoft.model.MachineEntity;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 6/26/13
 * Time: 6:47 AM
 * To change this template use File | Settings | File Templates.
 */


public interface ModelDAO
{
    public void createModel (MachineEntity machineEntity);
    public void updateModel (MachineEntity machineEntity);
    public void deleteModel (MachineEntity machineEntity);
    public void findModel();
}
