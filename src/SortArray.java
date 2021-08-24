import java.util.Arrays;
import java.util.Collections;
  
public class SortArray {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {4,5,2,6,1};   
        int temp = 0;  
          
        //Displaying elements of original array  
        System.out.println("Elements of original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
          
        //Sort the array in ascending order  
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] > arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }  
            for (int k = 0; k < arr.length; k++) {   
                System.out.print(arr[k] + " ");  
            } 
            System.out.println(); 
        }  
        
        System.out.println();  
          
        //Displaying elements of array after sorting  
        System.out.println("Elements of array sorted in ascending order: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
    }  

  
    static void twoWaySort(Integer arr[], int n)
    {
        // Current indexes from left and right
        int l = 0, r = n - 1;
 
        // Count of odd numbers
        int k = 0;
 
        while (l < r)
        {
         
            // Find first even number from left side.
            while (arr[l] % 2 != 0)
            {
                l++;
                k++;
            }
 
            // Find first odd number from right side.
            while (arr[r] % 2 == 0 && l < r)
                r--;
 
            // Swap even number present on left and odd
            // number right.
            if (l < r)
            {
             
                // swap arr[l] arr[r]
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
 
        // Sort odd number in descending order
        Arrays.sort(arr, 0, k, Collections.
                                  reverseOrder());
 
        // Sort even number in ascending order
        Arrays.sort(arr, k, n);
    }
 
    // Driver Method
   
    {
        Integer arr[] = { 1,2,4,5,6, };
 
        twoWaySort(arr, arr.length);
 
        System.out.println(Arrays.toString(arr));
    }
}