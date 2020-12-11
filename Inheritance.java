import java.util.Scanner;

class Member{
    String name;
    int age;
    long phoneNo;
    String address;
    double salary;

    void printSalary(){
        System.out.println("Salary is "+salary);
    }
}

class Employee extends Member{
    String specialiazation;
}

class Manager extends Member{
    String department;
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Enter Details of Employee in the order of \nName \nAge \nPhoneNo \nAddress \nSalary \nSpecialiazation");
        e.name = sc.nextLine();
        e.age = sc.nextInt();
        e.phoneNo = sc.nextLong();
        e.address = sc.next();
        e.salary = sc.nextDouble();
        e.specialiazation = sc.next();

        System.out.println("Details about Employee is :- ");
        System.out.println("Name - "+e.name+"\n Age - "+e.age+"\n Phone No. - "+e.phoneNo+"\n Address - "+e.address);
        e.printSalary();
        System.out.println("Specialization - "+e.specialiazation+"\n");

        System.out.println("Enter Details of Manager in the order of \nName \nAge \nPhoneNo \nAddress \nSalary \nDepartment");
        m.name = sc.nextLine();
        m.age = sc.nextInt();
        m.phoneNo = sc.nextLong();
        m.address = sc.next();
        m.salary = sc.nextDouble();
        m.department = sc.next();

        System.out.println("Details about Employee is :- ");
        System.out.println("Name - "+m.name+"\n Age - "+m.age+"\n Phone No. - "+m.phoneNo+"\n Address - "+m.address);
        m.printSalary();
        System.out.println("Department - "+m.department+"\n");
    }
}
