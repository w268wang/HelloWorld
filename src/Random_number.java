import java.util.Random;

public class Random_number {
        public static void main (String args[]) {
                Random rnd = new Random();
                int[] nums = new int[25];
                for (int i=1; i<26; i++) {
                        int p = rnd.nextInt(25);
                        if (nums[p] != 0)
                                i--;
                        else
                                nums[p] = i;
                }
                for (int i=0; i<25; i++) {
                        System.out.print(nums[i] + " ");
                        if (i % 5 == 4)
                                System.out.println();
                }
        }
}