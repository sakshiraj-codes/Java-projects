package org.TshirtSearchProgram;


import java.util.ArrayList;

public class TshirtView {

    public void viewTshirts(ArrayList<TshirtModel> TshirtList)
    {
        System.out.println("\n \t\t\t ***** Tshirt Store *****");
        System.out.println("| Tshirt_ID |\t\tName\t\t| Color | Gender | Size | Price | Rating |");
        for(TshirtModel t:TshirtList)
        {
            System.out.print("| "+t.getID());
            System.out.print(" | "+t.getName());
            System.out.print(" | "+t.getColor());
            System.out.print(" | "+t.getGender());
            System.out.print(" | "+t.getSize());
            System.out.print(" | "+t.getPrice());
            System.out.println(" | "+t.getRating()+" |");
    }
    if(TshirtList.isEmpty())
    {
        System.out.println("Tshirts Not Available.");
    }
    }
}
