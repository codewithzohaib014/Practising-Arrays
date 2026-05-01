import java.util.*;

public class task2 {

    public static void main(String[] args) {
        int [] num = new int [5];
        Scanner sc = new Scanner(System.in);

        // This loop is to take input form user 
        for (int i = 0; i < 5; i++) {
            num [i] = sc.nextInt();
        }
        // This loop is for updating values in array
        for ( int i=0; i<5; i++){
            num [i]= num[i]*2; // Values are updating here
        }
        // This loop is for printing the updated values in array
        for (int  n : num ) {
            System.out.println("Updated value in array is : " +n);
       
        }

    }
}
