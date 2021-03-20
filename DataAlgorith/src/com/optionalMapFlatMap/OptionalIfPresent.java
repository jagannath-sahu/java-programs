package com.optionalMapFlatMap;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalIfPresent {
  public static void main(String[] args) {
    Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));

    // Using Optional.ifPresent
    Consumer<PrimeMinister> pmConsumer = (PrimeMinister p) -> printName(p.getName());

    pm.ifPresent(pmConsumer);
  }

  private static String printName(String name) {
    System.out.println(name);
    return name;
  }
}
