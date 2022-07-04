import java.util.Arrays;

public class ArraySecondLargestNumber {
    public static void main(String[] args) {

        int arr[] = {5,3,6,2,7,13,14,14};
        int temp = 0;

        System.out.println("Elements of original array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("__________________________________________________");


        System.out.println("Lets Sort the array");
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("__________________________________________________");


        System.out.println("Lets Find out the largest Number");

        var firstLargest = arr[arr.length - 1];
        var secondLargest = arr[arr.length - 2];

        if(firstLargest == secondLargest){
            System.out.println("firstLargest == secondLargest");

            for (int k = arr.length - 1; k > 0; k--){
                if(secondLargest == firstLargest){
                    secondLargest = arr[k-1];
                }else{
                    break;
                }
            }
        }

        System.out.println("__________________________________________________");
        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("__________________________________________________");

    }
}
