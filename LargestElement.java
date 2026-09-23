// Given an array arr[]. The task is to find the largest element and return it.
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {63,65,84,77,10,3};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in the array:"+max);
    }
}
