// Java code below
import java.util.*;

class A {

    static boolean exists(int[] ints, int k) {
        Arrays.sort(ints);
        int left = 0;
        int right = ints.length-1;
       while(left<=right){
           int m = left+(right-1)/2;
           if(ints[right]==k){
               return true;
           }
           if(ints[right]==k){
               return true;
           }
           if(ints[m]<k){
               left=+1;
           }
           else{
               right=-1;
           }

       }
       return false;
        

		
	}
}