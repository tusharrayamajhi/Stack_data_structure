import java.util.*;
public class kadan {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,4,6,8,7,9};
        int maxsum = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            }
            maxsum = Math.max(maxsum, cs);
        }
        //System.out.println(Math.min(Integer.MAX_VALUE,-1));

        int arr1[] = new int[5];
        arr1[0]= 1;
        arr1[1] = 3;
        arr1[2] = 7;
        arr1[3] = 5;
        arr1[4] = 2;
        Arrays.sort(arr1);
        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
