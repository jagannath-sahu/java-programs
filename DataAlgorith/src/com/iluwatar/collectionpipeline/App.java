/*
 * The MIT License
 * Copyright © 2014-2021 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.iluwatar.collectionpipeline;

import java.util.List;

/**
 * In imperative-style programming, it is common to use for and while loops for most kinds of data
 * processing. Function composition is a simple technique that lets you sequence modular functions
 * to create more complex operations. When you run data through the sequence, you have a collection
 * pipeline. Together, the Function Composition and Collection Pipeline patterns enable you to
 * create sophisticated programs where data flow from upstream to downstream and is passed through a
 * series of transformations.
 */
public class App {

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    var cars = CarFactory.createCars();

    var modelsImperative = ImperativeProgramming.getModelsAfter2000(cars);
    System.out.println(modelsImperative.toString());

    var modelsFunctional = FunctionalProgramming.getModelsAfter2000(cars);
    System.out.println(modelsFunctional.toString());

    var groupingByCategoryImperative = ImperativeProgramming.getGroupingOfCarsByCategory(cars);
    System.out.println(groupingByCategoryImperative.toString());

    var groupingByCategoryFunctional = FunctionalProgramming.getGroupingOfCarsByCategory(cars);
    System.out.println(groupingByCategoryFunctional.toString());

    var john = new Person(cars);

    var tom = new Person(List.of(new Car("Jeep", "Wrangler", 2011, Category.JEEP),
            new Car("Jeep", "Comanche", 1990, Category.JEEP),
            new Car("Dodge", "Avenger", 2014, Category.SEDAN),
            new Car("Buick", "Cascada", 2016, Category.CONVERTIBLE),
            new Car("Ford", "Focus", 2013, Category.SEDAN),
            new Car("Chevrolet", "Geo Metro", 1992, Category.CONVERTIBLE)));

    var sedansOwnedImperative = ImperativeProgramming.getSedanCarsOwnedSortedByDate(List.of(john, tom));
    System.out.println(sedansOwnedImperative.toString());

    var sedansOwnedFunctional = FunctionalProgramming.getSedanCarsOwnedSortedByDate(List.of(john, tom));
    System.out.println(sedansOwnedFunctional.toString());
  }
}
