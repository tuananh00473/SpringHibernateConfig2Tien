package com.qsoft.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 6/26/13
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table (name = "Machine")
public class MachineEntity
{
    @GeneratedValue
    @Id
    @Column (name = "machine_id")
    public int machineId;

    @Column (name = "machine_code")
    public String machineCode;

    @Column (name = "machine_description")
    public String machineDescription;

    public int getMachineId()
    {
        return machineId;
    }

    public String getMachineCode()
    {
        return machineCode;
    }

    public String getMachineDescription()
    {
        return machineDescription;
    }

    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }

    public void setMachineCode(String machineCode)
    {
        this.machineCode = machineCode;
    }

    public void setMachineDescription(String machineDescription)
    {
        this.machineDescription = machineDescription;
    }
}
