package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    int n = 0;
    String[] phrase;
    public static void main(String[] args) {
        String word1 = "";
        String word2 = "";
        String word3 = "";
        String word4 = "";
        String word5 = "";
        String array[];
        String phraseValue;
        int nValue;

        PasswordGen newPassword = new PasswordGen();

        System.out.println("Enter 5 phrase words each: ");
        Scanner phraseScanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        word1 = phraseScanner.nextLine();
        System.out.println("Enter second word: ");
        word2 = phraseScanner.nextLine();
        System.out.println("Enter third word: ");
        word3 = phraseScanner.nextLine();
        System.out.println("Enter fourth word: ");
        word4 = phraseScanner.nextLine();
        System.out.println("Enter fifth word: ");
        word5 = phraseScanner.nextLine();
        nValue = newPassword.getN();
        newPassword.setN(nValue);

        newPassword.getPassword(nValue,word1, word2, word3, word4, word5);


    }
}

//For this assignment you will create a Java Class named PasswordGenerator.
//This class should contain private member variables for 5 phrase words and the n value as well
//as public methods to access and change the values of these variables. The class should also
//        contain a method called getPassword(), this method should return the password formed by
//  using the first n characters of each word of the phrase instance variable. If a word doesn’t have
//        n characters in it then use only the letters it does contain (see the example below with the word
//        “be”, where n=3). The class should contain a getPhrase() method that returns the entire phrase
//        as a single string of words separated by spaces and a getPasswordLength() method that returns
//        the length of the password generated using the given n value.
//        The driver (main method) for this class should prompt the user for the 5 phrase words and an
//        initial n value and then create a PasswordGenerator object, populate its data members and then
//        display the results of the getPassword() method along with the passwords length, then modify
//        the n value and display the results after calling getPassword() again along with the passwords
//        length.
//    Class PasswordGenerator
//-word1:String
//        -word2:String
//        -word2:String
//        -word3:String
//        -word4:String
//        -word5:String
//        -n: int
//        +PasswordGenerator(int, String, String, String, String, String)
//        +setPhrase(String, String, String, String, String)
//        +getPhrase(): String
//        +setN(int)
//        +getN: int
//        +getPassword(): String
//        +getPasswordLength(): int
//        Example:
//        Enter 5 Phrase words: May the Force be with
//        Enter default n value: 2
//        Using n: 2,
//        Password length=10: MathFobewi
//        Using n: 3
//        Password length=14: MaytheForbewit

