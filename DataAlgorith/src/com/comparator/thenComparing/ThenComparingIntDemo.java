package com.comparator.thenComparing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThenComparingIntDemo {
  public static void main(String[] args) {
    List<Student> list = Student.getStudentList();

    System.out.println("--------Example-1---------");
    Comparator<Student> comparator = Comparator.comparing(Student::getName, (s1, s2) -> s1.charAt(0) - s2.charAt(0))
        .thenComparingInt(Student::getAge);

    Collections.sort(list, comparator);
    list.forEach(s -> System.out.println(s.getName() + "-" + s.getAge()));

    System.out.println("--------Example-2---------");
    Comparator<Student> comparator1 = Comparator.comparing(Student::getName)
        .thenComparingInt(Student::getAge);

    Collections.sort(list, comparator1);
    list.forEach(s -> System.out.println(s.getName() + "-" + s.getAge()));

    System.out.println("--------Example-3---------");
    Comparator<Student> cmp = Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER);
    Collections.sort(list, cmp);
    list.forEach(s -> System.out.println(s.getName() + "-" + s.getAge()));

    System.out.println("--------Example-4---------");
    Comparator<Student> cmp1 = Comparator.comparing(Student::getName);
    Collections.sort(list, cmp1);
    list.forEach(s -> System.out.println(s.getName() + "-" + s.getAge()));

  }
}
