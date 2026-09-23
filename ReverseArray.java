public class ReverseArray{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int temp;
        System.out.println("The initial state of the array"+java.util.Arrays.toString(arr));
        System.out.println("Reversing the elements of the array");
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println("The reversed array is"+java.util.Arrays.toString(arr));
    }
}
// Notes and the mistakes that I have done:
// Took two nested loops and the forgot the swapping logic : Bubble Sort
// Then travelled the entire array so that the last half of the swapped elements were again unswapped
// Travelled only till the half of the array and then swapped the elements and then made the code effeicent in time and in space complexity