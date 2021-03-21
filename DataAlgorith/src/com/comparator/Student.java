package com.comparator;

import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int compareTo(Student s) {
    return name.compareTo(s.getName());
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

  public static List<Student> getStudentList() {
    Student s1 = new Student("Ram", 18);
    Student s2 = new Student("Shyam", 22);
    Student s3 = new Student("Mohan", 19);
    Student s4 = new Student("Mahesh", 20);
    Student s5 = new Student("Krishna", 21);
    List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
    return list;
  }
}
