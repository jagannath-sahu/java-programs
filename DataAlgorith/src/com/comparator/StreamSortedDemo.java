package com.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo {
  public static void main(String[] args) {
    List<Integer> numList = Arrays.asList(12, 10, 15, 8, 11);
    numList.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
    System.out.println("\n-----------");

    List<String> strList = Arrays.asList("Varanasi", "Allahabad", "Kanpur", "Noida");
    strList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
    System.out.println("\n-----------");

    System.out.println("\n");

    List<Student> stdList = Student.getStudentList();

    stdList.forEach(System.out::println);

    System.out.println("\n");

    stdList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s.getName() + " "));

    List<Student> sortedList = stdList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    System.out.println("\n");

    System.out.println("sorted List: " + sortedList);

    System.out.println("\n");
  }
}
