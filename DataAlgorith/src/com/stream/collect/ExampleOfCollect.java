package com.stream.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleOfCollect {

  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    names.add("A Java Website");
    names.add("B It learning a Website");
    names.add("C JavaGoal.com");
    names.add("D Java Website");


    System.out.println("--------Example-1---------");
    List<String> filterList = names.stream().filter((a) -> a.endsWith("Website")).collect(Collectors.toList());

    System.out.println("Printing from List");
    filterList.forEach(System.out::println);

    Map<String, String> filteredMap =
        names.stream().filter((a) -> a.endsWith("Website")).collect(Collectors.toMap(Function.identity(), s -> s));

    System.out.println("--------Example-2---------");
    System.out.println("Printing from Map");
    filteredMap.keySet().forEach(key -> System.out.println(filteredMap.get(key)));
    filteredMap.forEach((k,v)-> System.out.println(k + "-" + v));


    System.out.println("--------Example-3---------");
    Set<String> filterSet = names.stream().filter((a) -> a.endsWith("Website")).collect(Collectors.toSet());

    System.out.println("Printing from Set");
    filterSet.forEach(System.out::println);


  }

}
