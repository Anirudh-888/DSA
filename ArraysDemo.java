import java.util.*;
public class ArraysDemo{
    public static void main(String[] args) {
        int [ ] array1= {10,50,20,30,40};
       System.out.println("The elements that are stored in the array are");
       System.out.println(Arrays.toString(array1));
       ArrayList<Integer> as = new ArrayList<>();
       as.add(10);
       as.add(20);
       as.add(30);
       as.add(40);
       System.out.println("The elements that are stored in the array list are"+as);

    }
}