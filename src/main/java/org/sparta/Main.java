package org.sparta;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it contains a palindrome:");
        String sentence = input.nextLine();
        System.out.println("Which of the three methods would you like to use. Indicate using a number 1 2 3");
        int choice = input.nextInt();
        PalInterface checker = new PalThird();
        switch (choice){
            case 1:
                checker = new PalFirst();
                break;
            case 2:
                checker = new PalSecond();
                break;
            case 3:
                checker = new PalThird();
                break;
        }

        String[] words = sentence.split(" ");
        ArrayList<String> palindromesFound = new ArrayList<String>();

        for(String word: words){
            if(checker.isPalindrome(word)){
                palindromesFound.add(word);
            }
        }

        System.out.println("The following palindromes where found");
        for (String foundWord:palindromesFound) {
            System.out.println(foundWord);
        }
    }
}