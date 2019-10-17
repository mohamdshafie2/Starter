package com.ds.session.session4;

public class Penguin extends Bird {
// this is how you can make Penguin extend Bird.
// Bird is a parent class and Penguin is a subclass.
// Bird is a super class and Penguin is a subclass.
// Before you extend a class validate the (IS-A rule , if it passes, then extending is a possible solution, if not, then this is a good indication to go to interface)
// IS-A RULE applied here : is class Penguin a Bird ? if yes then this is eligible to extend. the answer is YES.
//



    @Override
    int layEgg() {
        return 5;
    }




}
