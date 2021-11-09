package happynewyear4;

import java.util.ArrayList;

public class Q5 {


    public static void main(String[] args) {
        ArrayList list = new ArrayList();   //Generic array list

        list.add("Kintal");
        list.add(null);
        list.add(true);
        list.add(10.5);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Selenium");
        list1.add("Java");
        list1.add("Postman");
        list1.add("Cucumber");
        list1.add("Scrum");
        list1.add("Jira");

        for (String str:list1){
            System.out.println(str);


        }



    }
}
