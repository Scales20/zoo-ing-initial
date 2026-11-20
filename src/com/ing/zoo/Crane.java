package com.ing.zoo;

import java.util.Random;

public class Crane {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Crane()
    {
    }

    public void sayHello() {
        helloText = "flap flap";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "silently eats leaves";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "gulp";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0)
        {
            trick = "flies above zoogoers' heads and occasionally divebombs them";
        } else if (rnd == 1) 
        {
            trick = "plucks thrown berries out of the air";
        } else 
        {
            trick = "retrieve toy from bottom of a puddle";
        }
        System.out.println(trick);
    }
}
