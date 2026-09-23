public class LeaderInArrayOptimized {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int leader[] = new int[arr.length];
        leader[0] = arr[arr.length-1];
        int count=1;
        int maximum = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]>maximum){
                leader[count]=arr[i-1];
                maximum=arr[i-1];
                count=count+1;
            }
        }
        for(int j=0;j<count/2;j++){
            int temp = leader[j];
            leader[j]=leader[count-j-1];
            leader[count-j-1]=temp;
        }
        System.out.println("The array containing the leader elements are");
        for(int i=0;i<count;i++){
            System.out.println(leader[i]);
        }

    }
}
// This is the best optimized code for the leaders problem
// The question of the problem is: 
// Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.

// Note: The rightmost element is always a leader.

// Examples:

// Input: arr[] = [16, 17, 4, 3, 5, 2]
// Output: [17 5 2]
// Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.

// Input: arr[] = [1, 2, 3, 4, 5, 2]
// Output: [5 2]
// Explanation: 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.