package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOfLazy
{
    public static void main(String[] args)
    {
        List<Integer> listOfNumber = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> stream = listOfNumber.stream();

        // Calling an Intermediate operation
        Stream<Integer> newStream = stream.map((number) -> printData(number));

        // Calling an Terminal operation
        //comment this line, no output will come
        newStream.forEach(a -> System.out.println("Calling by Terminal operation: "+ a));
    }
     public static Integer printData(Object number)
     {
         System.out.println("Calling by Intermediate operation : "+ number);
         return (Integer) number;
     }
}