package com.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
  public static void main(String[] args) {
    Student s1 = new Student("Ram", 18);
    Student s2 = new Student("Shyam", 22);
    Student s3 = new Student("Mohan", 19);

    Student[] stdArray = {s1, s2, s3};
    Arrays.sort(stdArray, Comparator.reverseOrder());
    for (Student s : stdArray) {
      System.out.print(s.getName() + " ");
    }
  }
}
