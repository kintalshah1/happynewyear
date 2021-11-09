package happynewyear4;

public class Q3 {

    public boolean isTeen(int age) {

        if (age <= 18) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;


        }
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        obj.isTeen(15);
        obj.isTeen(25);

    }



}
