package com.java24hours;

class Grade {

    public static void main(String[] arguments) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Awesome!");
            case 'B':
                System.out.println("Good...");
            case 'C':
                System.out.println("Nicht so gut...");
                break;
            default:
                System.out.println("You're terrible!");
        }
    }
}
