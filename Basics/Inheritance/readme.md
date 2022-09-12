## Question
Monster class. Monsters have to eat food. Each Monster has weight. Eating food increases weight by 1 unit. Monsters can also scare. But each monster scares differently. So, there is no way to define the function scare(Human) generally, for a monster. If we specify the monster then we can say how scare(Human) is implemented. Monsters also have a scareCount variable which keeps count of the number of humans scared until now.
Humans are implemented from an interface called Animal. Animal has the methods isintelligent() and expectedHeight(). For any human, expected height is half of that of its weight. isintelligent() returns true if intelligence is "high", false otherwise. For any human, the variables intelligence, bravery, and name are set during initialization, along with its weight.
Cookie Monster can only scare humans who are "not brave". Every time scare is called, it prints a scream from the human if he is not brave. In this scare(Human h) function, check if a human is brave or not; if not, print a scream and increase the scareCount variable by 1.
SacryMonster can scare everyone except those who are not intelligent which it determines by using the islntelligent() method. Every time scare is called, it prints the name of the human it scared. In this scare(Human h) function, check if a human is intelligent or not by calling isintelligent(); if true, print the name of the human and increase the scareCount variable by 1. 
Main Class Code's been given below. 
Generate output for this code:

    Human human1 = new Human("lon", 70, "medium", "brave"); 
    Human human2 = new Human("Sam", 100, "high", "not brave");
    //weight 100 kg
    Cookie Monster coo = new Cookie Monster(100); 
    coo.scare(human1); coo.scare(human2); coo.eat(); 
    System.out.println(coo);
    //prints weight and scareCount here.
    //weight is 500 kg initially,
    Scary Monster doggo = new Scary Monster(500); 
    doggo.eat(human 1); doggo.eat(human2); 
    System.out.println(doggo);
    //prints weight and scareCount here.

