package com.optional;

import java.util.ArrayList;
import java.util.Optional;

public class ExampleOfFindFirstInUserDefined {

  public static void main(String[] args)
  {
      ArrayList<Student> listOfStudent = new ArrayList<Student>();
      listOfStudent.add(new Student(010, "MTech", "Ram"));
      listOfStudent.add(new Student(200, "MCA", "Sham"));
      listOfStudent.add(new Student(103, "MCA", "Mohan"));
      listOfStudent.add(new Student(148, "BCA", "Lia"));
      listOfStudent.add(new Student(050, "BCOM", "Rai"));

      //Fining first the first student in Stream
      Optional<Student> firstStudent = listOfStudent.stream().findFirst();
      if(firstStudent.isPresent())
          System.out.println("Name of first Student: "+ firstStudent.get().getName());

      // Finding first student from class MCA
      Optional<Student> firstStudentFromMCA = listOfStudent.stream()
              .filter(student -> student.getClassName().equals("MCA")).findFirst();
      if(firstStudentFromMCA.isPresent())
      System.out.println("Name of first Student from MCA: "+ firstStudentFromMCA.get().getName());

  }

}
