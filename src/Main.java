import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //2089. Find Target Indices After Sorting Array
    public static void main(String[] args) {

        int[] array = new int[]{48, 90, 9, 21, 31, 35, 19, 69, 29, 52, 100, 54, 21, 86, 6, 45, 42, 5, 62, 77, 15, 38};
        sortArray(array, 6);
    }

    public static void sortArray(int[] nums, int target) {
        List<Integer> targetedList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int trenutni;
                if (nums[i] < nums[j]) {
                    trenutni = nums[i];
                    nums[i] = nums[j];
                    nums[j] = trenutni;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetedList.add(i);
            }
        }
        //return targetedList;
        System.out.println(Arrays.toString(targetedList.toArray()) + " count " + targetedList.size());
    }

}
