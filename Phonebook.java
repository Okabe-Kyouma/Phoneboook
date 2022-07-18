package com.Sharad;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {

    private String name;

    private long number;

    public Phonebook(String name, long number){
        this.name = name;
        this.number = number;
    }

    public Phonebook(){};

    public void search(String nam, ArrayList<Phonebook> arr){

        for(Phonebook value : arr ){

            if(Objects.equals(value.name, nam)){
                System.out.println("Name : "+value.name +" -> "+"Number: "+value.number);
                break;
            }
        }
        System.out.println("Couldn't found any contact with name: "+nam);
    }

    public void delete(String nam,ArrayList<Phonebook> arr){

        for(Phonebook value : arr){
            if(Objects.equals(value.name, nam)){
                   arr.remove(value);
                System.out.println("Removed");
                break;
            }
        }
        System.out.println("Couldn't found any contact with name: "+nam);
    }

    public String toString(){
        return "Name: "+ name +" -> "+ " Number: "+ number + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
