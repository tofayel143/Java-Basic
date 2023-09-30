package Assignment_1;

import java.util.ArrayList;

public class ArrayListExample {
	
    public static void main(String[] args) {
    	
        // Create a new ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<String>();
        System.out.println("Size of the ArrayList:"+stringList.size());
        // Add elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.remove(3);
        stringList.add("Monir");
        stringList.set(0, "Numan");
        stringList.set(0, "Shahalam");
        stringList.add("Reza");
        stringList.add("Sayna");
        stringList.set(0, "Rodela");
        stringList.set(2, "Shamima");
        stringList.add("Shareka");

        // Print out the collection
        System.out.println(stringList);
        System.out.println("Size of the ArrayList:"+stringList.size());

        for (int i=0; i<stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        
        stringList.clear();
		System.out.println(stringList);
    }
}

