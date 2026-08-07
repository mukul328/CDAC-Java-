import java.util.Scanner;

public class assignment3 {
    public static void main(String args[]){
//1.  Given age A,
// determine if a person is eligible to vote. Print
// if age ≥ 18, else print .
Scanner sc = new Scanner(System.in);

System.out.println("Enter the age: ");
int age  = sc.nextInt();
if(age>=18){
    System.out.println("Eligible to vote");
}
else{
    System.out.println("Not Eligible to vote");
}

// 2. Divisible Check
// Given a number N,
// print:        
// "FizzBuzz" if divisible by both 3 and 5       
// "Fizz" if divisible by 3       
// "Buzz" if divisible by 5      
// "None" otherwise 

System.out.println("enter the number: ");
int number = sc.nextInt();
if(number%3 ==0 && number%5==0){
    System.out.println("Fizzbuzz");
}
else if(number%3==0){
    System.out.println("Fizz");
}
else if(number%5 ==0)
{
    System.out.println("Buzz");
}

else{
    System.out.println("none");
}
// 3 . Temperature
// Category
// Given temperature T: T < 0 → "Freezing"
// 0 ≤ T ≤ 30 → "Normal"        
// T > 30 → "Hot"

System.out.println("Enter the temperature: ");
int temperature = sc.nextInt();

if(temperature<0){
    System.out.println("Freezing");
}
else if(temperature>=0 && temperature<=30){
    System.err.println("Normal");
}
else if(temperature>30){
    System.out.println("hot");
}



// 4  . Electricity Bill
// Given units consumed U, calculate bill:
// First 100 units → ₹5 per unit
// Next 100 units → ₹7 per unit
// Above 200 units → ₹10 per unit
// Print total bill
System.out.println("Enter the units consumed: ");
int unit = sc.nextInt();
if(unit<=100){
    System.out.println("The total bill is $:"+unit*5);
}
else if(unit>100 && unit<200){
    System.err.println("The total bill is : "+ unit*7);
}
else {
    System.out.println("The total bill is :"+ unit*10);
}

// 5  Game
// Score Decision
// Given scores of Player A and Player B       
// If A > B → "Player A Wins       
// If B > A → "Player B Wins"        
// Else → "Draw"
// If difference > 50 → Also print
// "Dominating Win"
System.out.println("Enter the score of the first player: ");
int score1 = sc.nextInt();
System.out.println("Enter the score of the second player: ");
int score2 = sc.nextInt();
if(score1-score2>50 || score2-score1>50){
    System.out.println("Dominating win");
}

else if(score1>score2){
    System.out.println("A wins ");
}
else if (score1<score2){
    System.out.println("B wins");
}


else{
    System.out.println("Draw");
}


// 6  Loan Eligibility
// Input: salary, credit score
// Eligible if:       
// Salary ≥ 30000      
// Credit Score ≥ 700
// If salary ≥ 50000 AND credit ≥ 750 →
// "Premium Eligible"
// Else → "Not Eligible"

System.out.println("enter the Salary :");
int Salary = sc.nextInt();

System.out.println("Enter the creditScore: ");
int creditScore = sc.nextInt();
if(Salary>50000 && creditScore>750){
    System.out.println("Premium Eligible");
}
else if(Salary> 30000 && creditScore>700){
    System.out.println("Eligible");
}


else {
        System.out.println("Not eligible");
    }

  
sc.close();
    }
}
