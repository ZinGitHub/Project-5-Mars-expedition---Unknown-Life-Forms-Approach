package com.company;

public class AlienTool
{
    // Declared public variable.
    public String Description;

    // Constructor for AlienTool.
    public AlienTool(String object)
    {
        // Refer to the object = Description.
        this.Description = object;
    }

    // Override so that MarsSuit condition and HealthStatus condition return string instead of the Hashcode.
    @Override
    public String toString()
    {
        return Description;
    }
}

