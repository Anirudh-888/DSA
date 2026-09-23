public class LeaderInArray{
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
         int[] leader = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==arr.length){
                leader[i]=arr[i];
            }
        }
        System.out.println("The array containing the leader elements of the array are"+java.util.Arrays.toString(leader));
    }
}
// The above code is in O(n2) so this is not the most optimized code
// The most optimized code is:
