package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
      //  String[] langs = {"C#", "Java", "Python", "JavaScript"};

        // for (int l = 0; l < langs.length; l++) {
        //      System.out.println("Я хочу выучить  " + langs[l]);
        // }
        List<String> langss = Arrays.asList("C#", "Java", "Python", "JavaScript", "C++");

        for (String i : langss) {
            System.out.println("Я хочу изучить " + i);
        }
    }
}
