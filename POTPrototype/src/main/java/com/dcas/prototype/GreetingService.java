package com.dcas.prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TChoudhury on 12/04/2016.
 */
public class GreetingService {

    List<Greeting> greetings = new ArrayList<>();

    public List<Greeting> initialGreetings(){

        Greeting g1 = new Greeting(1, "Assalamualikum");
        Greeting g2 = new Greeting(2, "wagwon");
        Greeting g3 = new Greeting(3, "Hello");

        greetings.add(g1);
        greetings.add(g2);
        greetings.add(g3);

        return greetings;
    }
}
