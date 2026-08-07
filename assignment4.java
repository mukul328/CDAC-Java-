public class assignment4 {
// Topic            2 march and 3rd march  --> Array 

// 1 . Write program to define array of size N and print sum  and average of all elements  
void printSumAndAverage(int arr[],int n){
     n = arr.length;
    double avg = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i]; 
    }
    avg = sum/n;
    System.out.println(avg);
    System.out.println(sum);
}
// 2. Write a Java program to search for an element in an
// array.

    public int searchArray(int arr[],int n , int target){
        
        for(int i =0;i<arr.length;i++){  
            if(arr[i]==target){
            return i;
            }
        }
        return -1;
    }
    
// 3 Write a Java program to find the sum of even numbers in
// an array.

    int sumOfEvenNumber(int arr[],int n){

        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
// 4 Reverse an array without using another array
public void reverseArray(int arr[],int n){
    int i=0;
    int j = arr.length-1;
    while(i<j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

}
// 5. Write a Java program to find the smallest number in an
// array.

int findSmallest(int arr[],int n){
    int smallest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(smallest>arr[i]){
            smallest = arr[i];
        }
    }
    return smallest;
}
// 6. Write a Java program to print the transpose of a
// matrix.
public void printTranspose(int[][] matrix) {

    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < cols; i++) {
        for (int j = 0; j < rows; j++) {
            System.out.print(matrix[j][i] + " ");
        }
        System.out.println();
    }
}

// 7: .  Given an array of N integers, perform one left rotation.
//  after rotation, the first element should move to the last position.
    public void leftRotate(int[] arr) {

    int first = arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
    }

    arr[arr.length - 1] = first;

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

public void moveZeros(int[] arr) {

    int index = 0;
    for (int i = 0; i < arr.length; i++) {

        if (arr[i] != 0) {
            arr[index] = arr[i];
            index++;
        }
    }
    while (index < arr.length) {
        arr[index] = 0;
        index++;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

public static void main(String[] args) {
    
}


















}
