import java.util.Scanner;

class StudentMarksheet{
    
    int roll;
    int math; 
    int physics;
    int comp;
    int total;
    String name;
    String grade;
    double avg;
    
    StudentMarksheet(){

    }

    StudentMarksheet(int r, String n, int m, int p, int c){

    }

    void setStudentDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Student in the order of \n 1. Name\n 2. Roll\n 3. Math's marks\n 4. Physics's Marks\n 5. Computer's Marks");
        name = sc.nextLine();
        roll = sc.nextInt();
        math = sc.nextInt();
        physics = sc.nextInt();
        comp = sc.nextInt();

        sc.close();
    }

    boolean isValid(int m, int p, int c) throws InterruptedException{

        System.out.print("Validating marks.......");

        for(int i=0; i<10; i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        if(m>0 && m<101 && p>0 && p<101 && c>0 && c<101){
            System.out.print("\n Yeah... Marks are perfectly valid you can go ahead");
            return true;
        } else {
            System.out.println("\n Sorry enter marks within 0 to 100 only...");
            return false;
        }
    }

    void generateMarksheet(){
        total = math + physics + comp;
        avg = total/3;

        if(avg<=100 && avg>=90){
            grade = "EX";
        } else if(avg<90 && avg>=80){
            grade = "A+";
        } else if(avg<80 && avg>=70){
            grade = "A";
        } else if(avg<70 && avg>=60){
            grade = "B+";
        } else if(avg<60 && avg>=50){
            grade = "B";
        } else if(avg<50 && avg>=40){
            grade = "C";
        } else {
            grade = "FAIL";
        }

    }

    void printMarksheet(){
        System.out.println("\n Performance of "+name+" roll no "+roll+" is :- ");
        System.out.println("\n Mathematics - "+math+"\n Physics - "+physics+"\n Computer - "+comp+"\n Percentage - "+avg+"%"+"\n Grade - "+grade);
    }
}



public class Marksheet {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of student ");
        int n = sc.nextInt();
        StudentMarksheet[] st = new StudentMarksheet[n];

        for(int i=0; i<n; i++){
            System.out.println("---------------------------------------------------------------------");
            st[i] = new StudentMarksheet(1, "Prabhakar", 67, 76, 80);
            st[i].setStudentDetails();

            boolean isMarksValid = st[i].isValid(st[i].math, st[i].physics, st[i].comp);
            if(isMarksValid){
                st[i].generateMarksheet();
                st[i].printMarksheet();
            } else {
                continue;    
            }
            
            System.out.println("---------------------------------------------------------------------");
        }

        sc.close();

    }
}
