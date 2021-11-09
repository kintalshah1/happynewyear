package happynewyear1;

public class ifThenElse {

    public boolean isTeen (int age){
        if(age<=18){
            System.out.println("true");
            return true;

        }else{
            System.out.println("false");
            return false;

        }


    }

    public static void main(String[] args) {
        ifThenElse obj = new ifThenElse();
        obj.isTeen(15);
        obj.isTeen(25);

    }
}
