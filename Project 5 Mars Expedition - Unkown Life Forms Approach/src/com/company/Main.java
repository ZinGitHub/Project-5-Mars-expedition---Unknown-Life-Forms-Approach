package com.company;

import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {

        // Introduction.
        System.out.println("*** Welcome back captain ***\n");
        System.out.println("* This program's purpose is to: *\n");
        System.out.println("\t* Report on the feeding of aliens. ");
        // Divider.
        System.out.println("-------------------------------------------------");

        System.out.println("* [STATUS REPORT] *");
        System.out.println("* Note: These aliens seem to behave like some sort of cow but for Mars * ");

        // Initialized variables correlating to the AlienBehavior constructor.
        AlienBehavior myAlien = new AlienBehavior(false, true, true);

        // Divider.
        System.out.println("-------------------------------------------------------");

        // Print out the status report on the aggression of the aliens.
        System.out.println("* [STATUS REPORT ON AGGRESSION] *");
        if (myAlien.A == false) {
            System.out.println("\t - Alien don't seem to show any signs of aggression towards us.");
        } else {
            System.out.println("\t - These aliens show signs of aggression.");
            System.out.println("\t - BE CAUTIOUS IF YOU ARE NEAR THESE ALIEN CREATURES.");
        }
        // Divider.
        System.out.println("-------------------------------------------------------");

        // Print out the status report on the communication of the alien.
        System.out.println("* [STATUS REPORT ON COMMUNICATION] *");
        if (myAlien.C == true) {
            System.out.println("\t - The aliens seem to attempt to communicate with us.");
            System.out.println("\t - We have not been able to thoroughly communicate with these aliens.");
        } else {
            System.out.println("\t - Aliens do not communicate with us.");
            System.out.println("\t - They seem to just eat the rocks we gave them and ignore us.");
        }
        // Divider.
        System.out.println("-------------------------------------------------------");

        // Print out the status report on the rover.
        System.out.println("* [STATUS REPORT ON ROVER] *");
        if (myAlien.R == true) {
            System.out.println("\t - Is the rover available: Yes");
            System.out.println("\t - Note: The rover seems to be a good device to herd these aliens. Giving us more evidence that these aliens are like space cows");
            System.out.println("\t - Cautious Note: If the rover is not moving the aliens will put rocks on the rover.");
        } else {
            System.out.println("\t - Is the rover available: No");
            System.out.println("\t - Get the rover back to the base.");
            System.out.println("\t - Cautious Note: If the rover is not moving the aliens will put rocks on the rover.");
        }
        // Divider.
        System.out.println("-------------------------------------------------------");

        // Print out the status on the aliens.
        System.out.println("* [STATUS REPORT ON ALIENS] *");

        AlienMembers MarsExploration = new AlienMembers("Mars Exploration 1");

        // Create alien status report on Splop the alien.
        AlienStatus ExplorationMember = CreateAlienStatus("Splop", 100
                , new AlienTool[]{new AlienHealthStatus("Exceptional")});

        // Add the alien Splop into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create alien status report on Bloop the alien.
        ExplorationMember = CreateAlienStatus("Bloop",100
                , new AlienTool[]{new AlienHealthStatus("Exceptional")});

        // Add the alien Bloop into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

        // Create alien status report on Baloney the alien.
        ExplorationMember = CreateAlienStatus("Baloney",100
                , new AlienTool[]{new  AlienHealthStatus("Exceptional")});

        // Add the alien Baloney into the Mars exploration list.
        MarsExploration.Members.add(ExplorationMember);

    }

    // Constant on the instructions on how to process and produces a status report on each alien.
    private static AlienStatus CreateAlienStatus(String name, int hunger, AlienTool [] alientools)
    {
        // Declared variables.
        int rocks = 3;
        boolean execute = true;

        // Generate random number.
        Random rand = new Random();

        AlienStatus newAlienMember = new AlienStatus();

        // Initialized variables correlated to AlienStatus.
        newAlienMember.Name = name;
        newAlienMember.Hunger = hunger;

        // for loop on adding alien tool to the list.
        for(AlienTool alienTool : alientools)
        {
            newAlienMember.AddAlienTool(alienTool);
        }

        // Report on each alien member with their name and health condition.
        System.out.println("Alien Name: " + newAlienMember.Name + ":");
        System.out.println("\t- Health Condition: "+ newAlienMember.AlienTool.get(0).toString());

        // Feed the aliens until you have no more rocks to spare.
        while (rocks > 0)
        {
            // Give alien a rock if their hunger is greater or equal to 100.
            if(newAlienMember.Hunger >= 100)
            {
                // Feed the aliens a rock.
                System.out.println(" * Feeding alien rock... * ");
                System.out.println("\t - Current Alien Hunger: " + (newAlienMember.Hunger - rand.nextInt(50)));
                rocks--;
            }
        }

        return newAlienMember;
    }
}