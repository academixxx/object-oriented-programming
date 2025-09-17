import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];

        // read 4 integer inputs
        for (int i = 0; i < 4; i++) {
            System.out.print("Input num" + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        // sort the array
        Arrays.sort(nums);

        // check for two pairs:
        if ((nums[0] == nums[1] && nums[2] == nums[3] && nums[0] != nums[2]) ||
            (nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[3])) {
            System.out.println("Two Pairs");
        } else {
            System.out.println("Not Two Pairs");
        }
    }
}
