package com.company;

import java.util.ArrayList;

public class AlienStatus
{
    // Declared public variables.
    public String Name;
    public int Hunger = 100;

    // Declared ArrayList in correlation to AlienTool.
    public ArrayList<AlienTool> AlienTool;

    // Constructor for AlienStatus.
    public AlienStatus()
    {
        // Reference to the AlienTool ArrayList.
        AlienTool = new ArrayList<AlienTool>();
    }

    // Return type for the alien tools.
    public void AddAlienTool(AlienTool myAlienTool)
    {
        // Add the alienTool object into myAlienTool.
        AlienTool.add(myAlienTool);
    }
}
