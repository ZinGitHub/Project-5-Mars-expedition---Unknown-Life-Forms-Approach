package com.company;

import java.util.ArrayList;

public class AlienMembers
{
    // Declared public variables.
    public String Name;
    public int Hunger = 100;

    //ArrayList created.
    public ArrayList<AlienStatus> Members;

    // Constructor for AlienMEmbers.
    public AlienMembers(String name)
    {
        // Refer to the object = name.
        this.Name = name;
        // Refer to the object = Members with Arraylist correlated to AlienStatus.
        this.Members = new ArrayList<AlienStatus>();
    }


}