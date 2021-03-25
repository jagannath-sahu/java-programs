package com.design.interfaceimpl;

public interface AquaticAnimal extends Animal{

  @Override
  default String getHabitat() {
      return "water";
  }

}
