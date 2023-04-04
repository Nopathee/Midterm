package Midterm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John" , "Peter" , "Disney" , "Piggy");

        //Lamda expression
        names.stream().filter(name -> name.startsWith("P")).forEach(System.out::println);

        //sort by method ref
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);

        //Lamda
        List<Integer> nameLengths = names.stream().map(name -> {
            System.out.println(name + "-" + name.length());

            return name.length();
        }).collect(Collectors.toList());
        System.out.println(nameLengths);

        //Basic
        List<Integer> nameLengthBasic = new ArrayList<>();
        for (String name : names){
            nameLengthBasic.add(name.length());
        }
        System.out.println(nameLengthBasic);
    }
}
