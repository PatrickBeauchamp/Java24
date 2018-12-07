package com.java24hours;

class Wheel{
    public static void main(String[] args){
        String phrase[] = {
            "A STITCH IN TIME",
            "DON'T EAT YELLOW SNOW",
            "JUST DO IT",
            "EVERY GOOD BOY DOES FINE",
            "I WAN'T MY MTV",
            "I LIKE MIKE",
            "PLAY IT AGAIN SAM",
            "FROSTY THE SNOWMAN",
            "ONE MORE FOR THE ROAD",
            "HOME FILED ADVANTAGE",
            "VALENTINE'S DAY MASSACRE",
            "GROVER CLEVELAND OHIO",
            "SPAGHETTI WESTERN",
            "AQAU TEEN HUNGER FORCE",
            "IT'S A WONDERFUL LIFE"
        };
        int[] letterCount = new int[26];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char letter = letters[count2];
                if ((letter >= 'A') && (letter <= 'Z')){
                    letterCount[letter - 'A']++;
                }
            }
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + ": " + letterCount[i - 'A'] + " ");
            if (i == 'M'){
                System.out.println("");
            }
        }
        System.out.println("");
    }
}