import java.util.Scanner;

public class ScanneerClass {
    Scanner sc=new Scanner(System.in);
    static void empDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String emp_Name=sc.nextLine();
        System.out.println("enter emp_Id");
        int emp_Id=sc.nextInt();
        System.out.println("enter Department");
        String dept=sc.next();
        sc.nextLine();
        System.out.println("enter Address");
        String Address=sc.nextLine();
        System.out.println("emp_Name :"+emp_Name);
        System.out.println("emp_Id :"+emp_Id);
        System.out.println("emp_Dept :"+dept);
        System.out.println("emp_Address :"+Address);
    }
    void vehicle(int tyres)
    {
        switch (tyres)
        {
            case 2:
                System.out.println("It is a two wheeler");
                break;
            case 3:
                System.out.println("It is a three wheeler");
                break;
            case 4:
                System.out.println("It is a four wheeler");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    public static void main(String[] args) {
        empDetails();
        ScanneerClass obj=new ScanneerClass();
        System.out.println("Enter the number of tyres");
        obj.vehicle(obj.sc.nextInt());
    }

}
