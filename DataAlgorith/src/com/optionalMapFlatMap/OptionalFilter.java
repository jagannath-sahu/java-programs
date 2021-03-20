package com.optionalMapFlatMap;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalFilter {

  public static void main(String[] args) {

    Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));

    // Using Optional.filter
    Predicate<PrimeMinister> pmPredicate = p -> p.getName().length() > 15;

    System.out.println(pm.filter(pmPredicate));
  }
}
