package happynewyear5;

import happynewyear1.ForLoop_Q4;

import java.util.Scanner;

public class Q4 {

    public void printMyName(String name, int howManyTime){

        for (int i = 1; i <howManyTime ; i++) {
            System.out.println(name);

        }



    }

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name:");
        String myName =scanner.nextLine();
        System.out.println("How many times you want to print your name:");
        int howManyTimes =scanner.nextInt();
        Q4 obj =new Q4();
        obj.printMyName(myName,howManyTimes);

    }


}
