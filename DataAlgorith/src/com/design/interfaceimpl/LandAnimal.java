package com.design.interfaceimpl;

public interface LandAnimal extends Animal{

  @Override
  default String getHabitat() {
      return "ground";
  }
}
