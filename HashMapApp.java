package hashmapapp;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapApp {

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> students = new HashMap<Integer, ArrayList<String>>();

        ArrayList<String> strArr1 = new ArrayList<String>();
        strArr1.add("English");
        strArr1.add("Maths");
        ArrayList<String> strArr2 = new ArrayList<String>();
        strArr2.add("German");
        strArr2.add("Biology");

        students.put(1, strArr1);
        students.put(2, strArr2);

        System.out.println(students);

    }

}
