package org.TshirtSearchProgram;

import java.io.FileNotFoundException;
import java.util.Scanner;
public class TshirtMain {

	public static void main(String[] args) throws FileNotFoundException {

        Scanner sc=new Scanner(System.in);
        String color, size, gender;
        int choiceCode;

        System.out.print("Enter Color  : ");
        color=sc.nextLine().toUpperCase();
        System.out.print("Enter Gender : ");
        size=sc.nextLine().toUpperCase();
        System.out.print("Enter Size   : ");
        gender=sc.nextLine().toUpperCase();
        System.out.print("Enter Output Preference :   1. Price \t 2. Rating \nEnter Preference Choice Code : ");
        choiceCode=sc.nextInt();

        TshirtStore ts=new TshirtStore();

        ts.searchTshirt("MavenProductSearch\\src\\main\\java\\org\\TshirtSearchProgram\\TshirtInformation\\Adidas.csv",color, size, gender);
        ts.searchTshirt("MavenProductSearch\\src\\main\\java\\org\\TshirtSearchProgram\\TshirtInformation\\Nike.csv",color, size, gender);
        ts.searchTshirt("MavenProductSearch\\src\\main\\java\\org\\TshirtSearchProgram\\TshirtInformation\\Puma.csv",color, size, gender);
        ts.updateView(choiceCode);

    }

}
