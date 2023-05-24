package com.bridgelabz.transaction.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyExample {

    public LazyExample(){
        System.out.println("This message from Lazy design pattern.");
    }

}
