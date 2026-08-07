import java.util.Scanner;

public class assignment2 {
// Q1 Write a program to calculate the sum of first 10 natural number.
public void printNaturalNumber(int n){
    int sum  = n*(n+1)/2;
    System.out.println("The sum is "+ sum);
}
// Q 2 Write a program that prompts the user to input a positive integer. 
// It should then print the multiplication table of that number.
   public void printTable(int n){
    int i =1;
    while(i<=n){
        System.out.println(n*i);
        i++;
    }
   }

//  Q3 Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//  For example, if the input is 12345, the output should be 54321.
public void printReverse(int n){
    int temp = n;
    int rev =0;
    while(temp>0){
    int digit = temp%10;
    rev = (rev*10)+ digit;
    temp = temp/10;
    }
    System.out.println(rev);
    
}
// Q 4 Write a do-while loop that asks the user to enter two numbers. 
// The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. 
// If so, the loop should repeat; otherwise it should terminate.(while loop)
public void printAlog(){
    boolean input;
    int sum = 0;
    try (Scanner sc = new Scanner(System.in)) {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        do{
            sum = num1 + num2;
            System.out.println(sum);
            System.out.println("Enter the input if you wish to continue");
            input = sc.nextBoolean();
        }
        while(input);
    }
}

// Q 5 Write a program to print out all Armstrong numbers between 1 and 500. 
// If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
void printArmstrongNumber(){

    int temp =0;
    for(int i =1;i<=500;i++){
        int sum =0;  
        temp =i;
    while(temp>0){
        int digit = temp%10;
        sum+= digit*digit*digit;
        
        temp=temp/10;

    }
    if(sum ==i){
        System.out.println(sum);
    }
}
    
}

//  Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 24 .....
public void printFib(int n){
    int prev =0;
    int curr =1;
    if(n>=1){
        System.out.println(prev);
    }
    if(n>=2){
        System.out.println(curr);

        for (int i =3; i <=n; i++) {
            int next = prev+curr;
            System.out.println(next);
            prev = curr;
            curr = next;
        }
    }
}

// Q 8 Write a program in java to find the sum of the even and odd digits of the number which is given as input.

public void PrintOddEvenDigitSum(int n){
    int temp =n;
    int sumEven =0;
    int sumOdd =0;
    while(temp>0){
        int digit = temp%10;
        if (digit%2==0) {
            sumEven+=digit;
        }
        else{
            sumOdd+=digit;
        }
        temp = temp / 10;
    }
    int totalSum = sumOdd+sumEven;
    System.out.println(totalSum);
}

// Q9 Write a program to check if given number is prime or not
    public boolean isPrime(int n){
        if(n<=1){
            System.out.println("Number is not prime");
        }
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }



// Q 10 write a program to print prime numbers between 2 to 20.
public void printPrimesTo20(){
    for(int i=2;i<=20;i++){
        if(isPrime(i)){
            System.out.println(i);
        }
    }
}

// Q 11 Write program to find largest among three numbers

public int findGreatest(int a,int b,int c){

    return Math.max(a,Math.max(b,c));
}

// Q 20 Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7

public void printNumb(){
    int sum =0;
    for(int i=101;i<200;i++){
        if(i%7==0){
            sum+=i;
        }
    }
    System.out.print(sum);
}

// Q 21    Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
public void printThreeFiveSeven(){
int i =1;
while(i<=100){
    if(i%3==0){
        System.out.println(i);
    }
    else if(i%5==0){
        System.out.println(i);
    }
    else if(i%3==0 && i%5==0){
        System.out.println(i);
    }
}
i++;
}
      


// Q 21 Write a program to display first 1 to 20  even number on screen .
//  Terminate the program when number 16 is found using break command .
public void display(){
    int i=1;
    while(i<20){
        if(i%2==0){
            if(i==16){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}





    public static void main(String args[]){





// i)

// **********
// **********
// **********
// **********
for(int i =0;i<10;i++){
    for(int j=0;j<10;j++){
        System.out.print("*");
        }
    System.out.println();
    }


     assignment2 obj = new assignment2();

   

    System.out.println("Q1");
    obj.printNaturalNumber(10);

    System.out.println("\nQ2");
    obj.printTable(10);

    System.out.println("\nQ3");
    obj.printReverse(12345);

    System.out.println("\nQ4");
    obj.printAlog();

    System.out.println("\nQ5");
    obj.printArmstrongNumber();

    System.out.println("\nQ6");
    obj.printFib(10);

    System.out.println("\nQ8");
    obj.PrintOddEvenDigitSum(123456);

    System.out.println("\nQ9");
    if (obj.isPrime(17)) {
        System.out.println("Prime");
    } else {
        System.out.println("Not Prime");
    }

    System.out.println("\nQ10");
    obj.printPrimesTo20();

    System.out.println("\nQ11");
    System.out.println("Greatest = " + obj.findGreatest(10, 25, 15));

    System.out.println("\nQ20");
    obj.printNumb();

    System.out.println("\n\nQ21");
    obj.printThreeFiveSeven();

    System.out.println("\nQ22");
    obj.display();

    System.out.println("\nPattern");
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.print("*");
        }
        System.out.println();
    }






}
}
