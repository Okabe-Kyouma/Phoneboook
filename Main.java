package com.Sharad;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Phonebook> arr = new ArrayList<>();

        Phonebook phonebook = new Phonebook();

        System.out.println("Welcome");

        int n;

        System.out.println("How many contacts you want to add?");

        n=input.nextInt();

        System.out.println("Nice! Now please enter the their Name and their phone number in the below format:");
        System.out.println("Name   Number");

        for(int a =0;a<n;a++){
            arr.add(new Phonebook(input.next(),input.nextLong()));
        }

        System.out.println("All contacts have been saved.");

        System.out.println("Here's our menu!");

        int num;

        while(true){

                System.out.println("Enter 1 to see All contacts!");
                System.out.println("Enter 2 to Delete your contact info!");
                System.out.println("Enter 3 to Search any contact");
                System.out.println("Enter 4 to exit");
                num = input.nextInt();


                if (num == 1) {
                    System.out.println("All contacts: ");
                    System.out.println(arr.toString());
                    System.out.println();
                }
                if (num == 2) {
                    System.out.println("Enter name to Delete your contact!");
                    phonebook.delete(input.next(), arr);
                    System.out.println();
                }
                if (num == 3) {
                    System.out.println("Enter name to search your contact details");
                    phonebook.search(input.next(), arr);
                    System.out.println();
                }
                if (num == 4) {
                    System.out.println("Good bye");
                    break;
                }

        }


    }
}