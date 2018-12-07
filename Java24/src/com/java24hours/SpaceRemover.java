package com.java24hours;

class SpaceRemover{
    public static void main(String[] args){
        String mostFamous = "Rudolf the Red-Nosed Reindeer";
        char[] mf1 = mostFamous.toCharArray();
        for (int i = 0; i < mf1.length; i++) {
            char current = mf1[i];
            if (current != ' '){
                System.out.print(current);
            }else{
                System.out.print('.');
            }
        }
        System.out.println("");
    }
}