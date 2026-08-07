import java.util.Scanner;

public class assignment1 {
  
  public static void main(String[] args) {
// Q 1 Check whether a number entered by the user is even or odd.
Scanner sc = new Scanner(System.in);
System.out.println("Enter the num");
int num = sc.nextInt();

if(num%2==0){
    System.err.println("Even");
}
else{
    System.err.println("Odd");
}



// Q 2 Check if a person is eligible to vote (age must be 18 or above).
System.out.println("Enter the age : ");
int age  = sc.nextInt();

if(age>=18){
    System.out.println("Eligible to vote ");

}
else{
    System.out.println("Not Eligible");
}


// Q 3 Find the largest of two numbers entered by the user.
    System.out.println("Enter the number 1");
    int num1 = sc.nextInt();

    System.out.println("Enter the number 2");
    int num2 = sc.nextInt();

    if(num1>num2){
        System.out.println("Number: num1 is greater ");
    }
    else if(num1==num2){
        System.out.println("Equal");
    }
    else{
        System.out.println("Number:num2 is greater");   
    }


  }
}