import java.util.ArrayList;
import java.util.List;

class leet448 {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        // Cyclic Sort
        while (i < nums.length) {

            if (nums[i] != i + 1) {

                int correctIndex = nums[i] - 1;

                if (nums[i] != nums[correctIndex]) {

                    swap(nums, i, correctIndex);

                } else {

                    i++;
                }

            } else {

                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}