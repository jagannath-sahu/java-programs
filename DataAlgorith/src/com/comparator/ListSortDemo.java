package com.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo {
  public static void main(String[] args) {
    List<Integer> numList = Arrays.asList(12, 10, 15, 8, 11);
    numList.sort(Comparator.reverseOrder());
    numList.forEach(n -> System.out.print(n + " "));
    System.out.println("\n-----------");

    List<String> strList = Arrays.asList("Varanasi", "Allahabad", "Kanpur", "Noida");
    strList.sort(Comparator.reverseOrder());
    strList.forEach(s -> System.out.print(s + " "));
    System.out.println("\n-----------");

    List<Student> stdList = Student.getStudentList();
    stdList.sort(Comparator.reverseOrder());
    stdList.forEach(s -> System.out.print(s.getName() + " "));
  }
}
