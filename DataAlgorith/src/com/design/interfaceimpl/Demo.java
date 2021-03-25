package com.design.interfaceimpl;

public class Demo {

  public static void main(String[] args) {

    Frog frog = new Frog(29);

    String habitatWhenYoung = frog.getHabitat();

    System.out.println(habitatWhenYoung);  // water

    frog.liveOneDay();

    String habitatWhenOld = frog.getHabitat();

    System.out.println(habitatWhenOld);  // ground

  }

}
