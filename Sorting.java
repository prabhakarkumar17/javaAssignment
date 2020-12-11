import java.util.Scanner;

class acceptStringArray{
    int n;
    String[] sentences = new String[50];
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total no of Sentences you want to insert :- ");
        n = sc.nextInt();
        for(int i=0; i<=n; i++){
            sentences[i] = sc.nextLine();
        }
        sc.close();
    }

    void check(){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(sentences[i].compareTo(sentences[j])>0){
                    String temp = sentences[i];
                    sentences[i] = sentences[j];
                    sentences[j] = temp;
                }
            }
        }
    }
    
    void display(){
        System.out.println("Sentences after rearrangement is :- ");

        for(int i = 0; i<=n; i++){
            System.out.println(sentences[i]);
        }
    }
    
}

public class Sorting {
    public static void main(String[] args) {

        acceptStringArray acc = new acceptStringArray();
        acc.accept();
        acc.check();
        acc.display();             
    }
}
