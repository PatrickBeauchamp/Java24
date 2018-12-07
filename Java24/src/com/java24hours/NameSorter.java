package com.java24hours;

import static java.util.Arrays.sort;

class NameSorter {

    public static void main(String[] args) {
        String[] names = {"Glimmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
        System.out.println("The original order: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " : " + names[i]);
        }
        sort(names);
        System.out.println("");
        System.out.println("The new order: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " : " + names[i]);

        }
    }
}
