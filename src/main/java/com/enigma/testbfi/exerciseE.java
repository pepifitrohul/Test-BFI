package com.enigma.testbfi;

public class exerciseE {
    public static void main(String[] args) {
        exerciseE();
    }

    public static void exerciseE(){
        System.out.println(solutionE("To Stark"));
        System.out.println(solutionE("Peter Parker"));
        System.out.println(solutionE("Bumblebee"));
        System.out.println(solutionE("El Taurino"));
        System.out.println(solutionE("John Doe"));
        System.out.println(solutionE("Crazy Rich Asian"));
        System.out.println(solutionE("Stephen Strange"));
        System.out.println(solutionE("A Kid With Supernatural Abilities"));
    }

    public static String solutionE(String original) {
        String word[] = original.split(" ");
        String filter[]=new String[0];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length ; i++) {
            if (word[i].length()>2){
                filter=word[i].split("");
                result.append(filter[0]);
                for (int j = 1; j < filter.length; j++) {
                    if (filter[j] == filter[0] || filter[j] == filter[filter.length - 1]) {
                        result.append("*");
                    }
                    result.append(filter[filter.length-1]);
                }
            }else {
                result.append(word[i]);
            }
            result.append(" ");
        }
        return result.toString();
    }

}
