package com.optionalMapFlatMap;

import java.util.Optional;

public class OptionalDemo {

  public static void main(String[] args) {

    Optional<PrimeMinister> primeMinister = Optional.of(new PrimeMinister("Narendra Modi"));
    Optional<Country> country = Optional.of(new Country(primeMinister));
    Optional<Person> person = Optional.of(new Person(country));

    /*
     * here flatMap method is same as map() method but the difference is that the method argument (for example Person::getCountry)
       which is a function must have Optional mapper
     */
    String pmName = person.flatMap(Person::getCountry).flatMap(Country::getPrimeMinister)
            .map(PrimeMinister::getName).orElse("None");

    System.out.println(pmName);

  }

}
