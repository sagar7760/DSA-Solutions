package JavaCollections;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Create an array of integers with some unsorted values 
        Integer[] numbers = {10, 20, 30, 40, 50,8,1,3,5,7,9,12,14,16,18,11,13,15,17,19,
                         21,23,25,27,29,22,24,26,28,31,
                         33,35,37,39,32,34,36,38,41,
                         43,45,47,49,42,44,46,48,51,
                         53,55,57,59,52,54,56,58,61,
                         63,65,67,69,62,64,66,68,71,
                         73,75,77,79,72,74,76,78,81,
                         83,85,87,89,82,84,86,88,91,
                         93,95,97,99,92,94,96,98,100,
                         4, 6, 15, 27, 39, 48, 59, 68, 77, 86,
                         95, 14, 25, 36, 47, 58, 69, 78, 89, 90,
                         11, 22, 33, 44, 55, 66, 75, 84, 93, 102,
                         13, 24, 35, 46, 57, 67, 76, 85, 94, 105,
                         12, 23, 34, 45, 54, 65, 74, 83, 92, 101,
                         9, 18, 29, 38, 49, 60, 71, 80, 91, 104,
                         8, 17, 28, 37, 50, 61, 70, 81, 88, 103,
                         7, 16, 31, 40, 53, 62, 79, 82, 87, 106,
                         5, 19, 32, 41, 52, 63, 72, 83, 90, 107};

        int n=numbers.length;
        System.out.println("Length of the array is "+n);
        
        //sort array
        Arrays.sort(numbers);

        // Print the elements of the array
        // System.out.println("Array elements:");
        // for (int number : numbers) {
        //     System.out.println(number);
        // }

        //searching for element in an array using for loop
        // int searchElement = 107;
        // long startTime1 = System.nanoTime();
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]==searchElement){
        //         System.out.println("Element "+searchElement+" found at index "+i);
        //         break;
        //     }
        // }
        // long endTime1 = System.nanoTime();
        // long duration1 = endTime1 - startTime1;
        // System.out.println("Time taken to search the element using for loop: " + duration1 + " milliseconds");
        // System.out.println("-----------------------------------");
        // //searching for element in an array using binary search
        long startTime = System.nanoTime();
        Arrays.binarySearch(numbers,107);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken to search the element using binary search: " + duration + " nanoseconds");

        //copying array
        // int[] newArray = Arrays.copyOf(numbers, 6);
        // for (int number : newArray) {
        //     System.out.println(number);
        // }
        //convert array to arraylist
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(numbers));
        // System.out.println(arrayList);
        long startTime2 = System.nanoTime();
        boolean found = arrayList.contains(107);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Time taken to search the element in arraylist using contains method: " + duration2 + " nanoseconds "+found);

    }
}
