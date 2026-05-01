//calculating sum of and ary
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int[] price = new int[4];
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        for (int i = 0; i < 4; i++) {
           price[i] =sc.nextInt();
            sum = sum + price[i];
        }
System.out.println("Total bill is" + sum);
    }

}
