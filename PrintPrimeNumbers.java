import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class PrimeNumber{
    int start;
    int end;
    ArrayList<Integer> primeNoList = new ArrayList<Integer>();

    PrimeNumber(){
        System.out.println("\n\n-------------------------Printing Prime nos :- -------------------------\n");
    }

    void setRange(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting and ending range of number :- ");
        start = sc.nextInt();
        end = sc.nextInt();
        System.out.println();

        sc.close();
    }

    boolean isPrime(int no){
        
        int flag = 0;
        for(int j=2; j<=Math.sqrt(no); j++){
            if(no%j == 0){
                flag = 1;
                return false;
            } 
        }
        if(flag == 0)
            primeNoList.add(no);   
            
        return true;
        
    }

    void printList(){
        System.out.print("So, out of the range given, the prime nos are :- ");
        System.out.print( primeNoList + " ," );
        System.out.println();
    }
}

public class PrintPrimeNumbers{
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();

        pn.setRange();
        for(int i = pn.start; i<=pn.end; i++){
            boolean success = pn.isPrime(i);
        }

        pn.printList();
    }
}