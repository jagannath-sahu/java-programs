package com.design.interfaceimpl;

public class Frog implements AquaticAnimal, LandAnimal{
  
  private int ageInDays;

  public Frog(int ageInDays) {
      this.ageInDays = ageInDays;
  }

  public void liveOneDay() {
      this.ageInDays++;
  }

  @Override
  public String getHabitat() {
      if (this.ageInDays < 30) { // is it a tadpole?
          return AquaticAnimal.super.getHabitat();
      } // else
      return LandAnimal.super.getHabitat();
  }

}
