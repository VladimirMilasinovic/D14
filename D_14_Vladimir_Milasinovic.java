package Paket2;

import java.util.ArrayList;
import java.util.Scanner;

public class arraydomaci1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList imena = new ArrayList<>();
        imena.add("Marija");
        imena.add("Petar");
        imena.add("Darko");
        imena.add("Bojana");
        imena.add("Lenka");
        imena.add("Petar");

        System.out.println("Unesi ime");
        String ime = sc.next();

        boolean obrisanoJeIme = false;

        for (int i =imena.size() -1 ; i >=0 ; i--){

            if(imena.get(i).equals(ime)){
                obrisanoJeIme = true;
                imena.remove(i);
            }
        }
        if(!obrisanoJeIme){
            System.out.println("Nema imena u listi");
        }
        else{
            System.out.println(ime + " je obrisano.");
        }
        System.out.println(imena);
    }
    }

