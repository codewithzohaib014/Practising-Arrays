import java.util.*;

public class task2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in) ;
System.out.println("Entre 5 numbers");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
int n4 = sc.nextInt();
int n5 = sc.nextInt();

int [] numbers = {n1,n2,n3,n4,n5};
int max = numbers [0];
for ( int i=1 ;i<numbers.length;i++) {
   if ( numbers[i]>max) {
    max = numbers[i];
   }
  
}
 System.out.println("maximum number is : " +max );








    }
}
