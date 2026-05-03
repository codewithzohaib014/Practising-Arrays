public class task12 {
// Method to calculate sum of all elements in a 1D array
    public static int arraySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr [i];
        }
        return sum;
    } 
    // Method to find maximun number in 1D array
public static int maxNumber ( int arr []) {

        int max = arr[0];
        for ( int i=0; i<arr.length; i++ ) {
            if ( arr[i]>max ) {
            max = arr[i];
        }
    }
        return max;
}
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        //Calling method 1 to give sum of array
        int result = arraySum(arr);
        System.out.println("sum is " + result);
        //Calling method 2 to give maximumnumber of array
        int max = maxNumber (arr);
        System.out.println("Maximum number is : " + max);
    }
}
