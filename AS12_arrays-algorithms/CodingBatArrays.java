import java.util.Scanner;

public class CodingBatArrays
{
    // copy your codingBat solutions here and submit with your other program files
    public static boolean firstLast6(int[] nums) {
      if (nums[0] == 6 || nums[nums.length-1] == 6){
        return true;
      }
      else{
        return false;
      }
    }

    public static boolean no23(int[] nums) {
      if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
        return false;
      }
      else{
        return true;
      }
    }
    
    public int[] maxEnd3(int[] nums) {
      if (nums[0] > nums[nums.length-1]) {
        nums[0] = nums[0];
        nums[1] = nums[0];
        nums[2] = nums[0];
      }
      else {
        nums[0] = nums[2];
        nums[1] = nums[2];
        nums[2] = nums[2];
      }
      return nums;
    }
    
    // public int[] maxEnd3(int[] nums) {
      // int max = Math.max(nums[0], nums[2]);
      // nums[0] = max;
      // nums[1] = max;
      // nums[2] = max;
      // return nums;
      // didn't know there was a Math.max function
    // }
    
    public boolean lucky13(int[] nums) {
      for (int i = 0 ; i < nums.length ; i++){
        if (nums[i] == 1 || nums[i] == 3){
          return false;
        }
      }
      return true;
    }
    
    public boolean sum28(int[] nums) {
      int sum = 0;
      for (int i = 0 ; i < nums.length ; i++) {
        if (nums[i] == 2){
          sum += 2;
        }
      }
      if (sum == 8){
        return true;
      }
      else{
        return false;
      }
    }

    public int[] tenRun(int[] nums) {
      int x = 0;
      boolean isTen = true;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i]%10 == 0) {
          x = nums[i];
          isTen = false;
        }
        else if (nums[i]%10 != 0 && !isTen) {
          nums[i] = x;
        } 
      }
      return nums;
    }
}
