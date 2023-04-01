import java.util.*;

public class Max{
    static void maximum(int array[]){
        int max = 0;
        for(int i=0; i< array.length; i++){
            if(array[i] > max){
                max = array[i]; //comparing the flag variable with all the array element.
            }
        }
        System.out.println("Maximu elemnet of your array : " + max);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for(int i=0; i<array.length; i++){
            System.out.println("Enter number " + (i+1) );
            int number = scanner.nextInt();
            array[i] = number;
        }
        scanner.close();
        maximum(array); //calling the max function to find the max value of the array passed to it
        //the array is user defined
    }
}