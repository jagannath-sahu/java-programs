package com.design.strategyUsingLamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample {

  public static void main(String[] args) {

    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
    System.out.println(totalValues(values, e -> true));
    System.out.println(totalValues(values, e -> e % 2 == 0));
    System.out.println(totalValues(values, e -> e % 2 != 0));

  }

  public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {

    int total = 0;
    for(int i : numbers) {
      if(selector.test(i)) {
        total += i;
      }
    }
    return total;
  }

}
