package com.company;

public class AlienHealthStatus extends AlienTool
{
    // Declared variable.
    public String AlienCondition;

    // Constructor for alienHealthStatus.
    public AlienHealthStatus(String AlienCondition)
    {
        // Recall the parent constructor with the addition of AlienCondition.
        super(AlienCondition);
    }
}
