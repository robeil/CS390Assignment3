package CS390Asssignment3;

import java.util.Arrays;

public class Prog3 {

    public static boolean binarySearch(int[] array, int left, int right, int target){

        //sorting the array first
       Arrays.sort(array);

       // storing the middle index
       int middleArray = left + (right - left) /2;

        if(array.length == 0){
            return false;
        } else {
            if(target == array[middleArray]){
                System.out.println( array[middleArray]);
                return true;
            }
            if(target < array[middleArray]){
                return binarySearch(array,left, middleArray, target);
            } else {
               return binarySearch(array,middleArray, right, target);
            }
        }
    }
    public static void main(String[] args) {

        int[]array = {2,6,8,9,5,4,1,3,11};

       System.out.println(binarySearch(array,0,array.length-1,9));
    }
}
