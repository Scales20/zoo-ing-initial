package com.ing.zoo;

import java.util.Random;

public class Carp {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Carp()
    {
    }

    public void sayHello() {
        helloText = "blub blub blub";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "small splash";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0)
        {
            trick = "swim through an obstacle course of seven hoops";
        } else {
            trick = "retrieve an object from the bottom of the aquarium and present it to the keeper";
        }
        System.out.println(trick);
    }
}
