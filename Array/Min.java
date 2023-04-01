import java.util.*;

public class Min{

    static void minimum(int array[]){
        int min = array[0]; //initializing witht the 1st element of array so that the value can be compared with the elements of array
        for(int i=0; i< array.length; i++){
            if(array[i] < min){
                min = array[i]; //comparing the flag variable with all the array element.
            }
        }
        System.out.println("Minium elemnet of your array : " + min);
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
        minimum(array); //calling the minimum function to find the max value of the array passed to it
        //the array is user defined
    }
}