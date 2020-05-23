package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PasswordGen {
    private String word1 = "";
    private String word2 = "";
    private String word3 = "";
    private String word4 = "";
    private String word5 = "";
    private int n = 0;
    String[] phrase;


    public void setPhrase(String word1, String word2, String
            word3, String word4, String word5) {
        this.word1 = word1;
        this.word2 = word2;
        this.word3 = word3;
        this.word4 = word4;
        this.word5 = word5;
    }



    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        System.out.println("Enter default n value: ");
        Scanner nValueScanner = new Scanner(System.in);
        int nValue = nValueScanner.nextInt();
        return nValue;

    }

    public void getPassword(int number, String word1, String word2, String word3, String word4, String word5) {
        this.word1 = word1;
        this.word2 = word2;
        this.word3 = word3;
        this.word4 = word4;
        this.word5 = word5;
        if (word1.length() >= number){
            word1 = word1.substring(0, number);
        }
        else{

        }

        if (word2.length() >= number){
            word2 = word2.substring(0, number);
        }
        else{

        }

        if (word3.length() >= number){
            word3 = word3.substring(0, number);
        }
        else{

        }
        if (word4.length() >= number){
            word4 = word4.substring(0, number);
        }
        else{

        }

        if (word5.length() >= number){
            word5 = word5.substring(0, number);
        }
        else{

        }
        System.out.println(word1 + word2 + word3 + word4 + word5);


    }

}
