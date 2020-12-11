import java.util.regex.*;
import java.util.Scanner;

class rollNoException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    rollNoException(String s) {
        super(s);
    }
}

public class customException {

    static void check() throws rollNoException{
        Scanner sc = new Scanner(System.in);
        String roll;

        System.out.print("\n Enter Roll no according to the given pattern 90/MCA/1*00** :-");
        roll = sc.nextLine();

        if(Pattern.matches("^90/MCA/1[0-9]00[0-9][0-9]$", roll)){
            System.out.println("\n ** Roll No accepted");
        } else {
            throw new rollNoException("\n Entered Roll No is not valid");            
        }
    }
    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception is here : "+e);
        }
    }
}
