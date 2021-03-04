package com.codersbay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
       String read;

       read=console.readLine();
       int length=read.length();

       String[] characters=read.split("");

       for (int i=0; i<length; i++){

           String translate= switch (characters[i]){
               case"A":
                   yield "@";
               case "B":
                   yield "8";
               case "C":
                   yield "(";
               case "D":
                   yield "D";
               case "E":
                   yield "3";
               case "F":
                   yield "F";
               case "G":
                   yield "6";
               case "H":
                   yield "#";
               case "I":
                   yield "!";
               case "J":
                   yield "J";
               case "K":
                   yield "K";
               case "L":
                   yield "1";
               case "M":
                   yield "M";
               case "N":
                   yield "N";
               case "O":
                   yield "0";
               case "P":
                   yield "P";
               case "Q":
                   yield "Q";
               case "R":
                   yield "R";
               case "S":
                   yield "/$";
               case "T":
                   yield "7";
               case "U":
                   yield "U";
               case "V":
                   yield "V";
               case "W":
                   yield "W";
               case "X":
                   yield "X";
               case "Y":
                   yield "Y";
               case "Z":
                   yield "2";
               default:
                   yield "Invalid";
           };

           System.out.print(translate);
       }
    }
}
