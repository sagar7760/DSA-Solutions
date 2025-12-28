package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        insertionSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static int[] insertionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int j=i;
            while (j>0 && nums[j-1]>nums[j]) {
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j--;
            }
        }
        return nums;
    }
}
