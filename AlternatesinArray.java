public class AlternatesinArray {
    public static void main(String args[])
    {
        int [] arr = {1,2,3,4};
        for(int i = 0 ;i<arr.length;i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}
// Mistakes what I had done before achieving the best code with best time complexity and space complexity.
// for(int i=0;i<arr.length;i++)
 // if(i%2!=0){
//     System.out.println("");
// }
// else{
//     System.out.println(arr[i]);
// }
// if(i%2!=0){
//     continue;
// }
// System.out.println(arr[i]);
