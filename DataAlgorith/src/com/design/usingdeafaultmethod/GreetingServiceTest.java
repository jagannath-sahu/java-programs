package com.design.usingdeafaultmethod;

/**
 * Test case showing how default methods work.
 */
public class GreetingServiceTest {


    public static void main(String[] args) {
        System.out.println("Hello World!".equals(new DefaultGreetingService().greet()));
        System.out.println("Hello Pete!".equals(new ExtendedGreetingService("Pete").greet()));
        System.out.println("Salut le monde!".equals(new DerivedGreetingService().greet()));
        System.out.println("Hello World!".equals(new CombinedGreetingService().greet()));
    }
}
