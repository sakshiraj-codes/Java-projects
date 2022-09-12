package org.TshirtSearchProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class TshirtStore {
	static ArrayList<TshirtModel> TshirtList=new ArrayList<TshirtModel>();
    static ArrayList<String> arr;
    TshirtView view=new TshirtView();
    
	public static void searchTshirt(String filename, String color, String size, String gender) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()) {
            String line = sc.nextLine().toUpperCase().toString();
            if (!line.isEmpty()) {
                StringTokenizer token = new StringTokenizer(line, "|");
                try {
					arr = new ArrayList<String>(line.length());
				} catch (Exception e) {
					e.printStackTrace();
				}
                while (token.hasMoreTokens()) {
                    arr.add(token.nextToken());
                }
                if (arr.get(2).equals(color) && arr.get(3).equals(size) && arr.get(4).equals(gender)) {
                    TshirtModel model = new TshirtModel(arr.get(0), arr.get(1), arr.get(2), arr.get(3), arr.get(4), Float.parseFloat(arr.get(5)), Float.parseFloat(arr.get(6)));
                    TshirtList.add(model);
                }
            }
        }
    }

    public void updateView(int choiceCode)
    {
        if(choiceCode==1)
        {
            Collections.sort(TshirtList, new Comparator<TshirtModel>() {
                public int compare(TshirtModel o1, TshirtModel o2) {
                    return (int) (o1.getPrice() - o2.getPrice());
                }
            });
        }
        else if(choiceCode==2)
        {
            Collections.sort(TshirtList, new Comparator<TshirtModel>() {
                public int compare(TshirtModel o1, TshirtModel o2) {
                    return (int)( o2.getRating() - o1.getRating());
                }
            });
        }
        else
        {
            System.out.println("Wrong Choice.");
            return;
        }
        view.viewTshirts(TshirtList);

    }
}