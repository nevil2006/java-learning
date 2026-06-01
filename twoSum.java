import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                output[0] = map.get(complement);
                output[1] = i;
                return output;
            }

            map.put(nums[i], i); 
        }

        return new int[]{}; 
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
}