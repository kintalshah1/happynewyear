package happynewyear2;

import happynewyear1.Variable_Q2;

public class Q2 {


    int id;
    String name;

    public Q2(int id,String name) {

        this.id =id;
        this.name = name;

    }
    public void display(){

        System.out.println(id);
        System.out.println(name);

    }

    public static void main(String[] args) {

        Variable_Q2 obj = new Variable_Q2(101,"Kintal");
        obj.display();

        Variable_Q2 obj1 = new Variable_Q2(102,"Prime");
        obj1.display();


    }

}
