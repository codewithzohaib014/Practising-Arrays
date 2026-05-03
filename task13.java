public class task13 {

public static int minNumber ( int arr [] ) {

 int min = arr [0]; 
for (int i=0;i<arr.length;i++){
    if ( arr[i]<min){
        min = arr [i];
    }
}
return min ;
}

    public static void main(String[] args) {
        int arr [] = {10,2,1,5,8};

        int min = minNumber(arr);
        System.out.println("Minimum number is : "+ min);




}
}
