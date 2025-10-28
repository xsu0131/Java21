package Collections;

import java.util.*;
import java.util.Comparator;

public class Demo
{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
//        nums.add(4);
//        nums.add(3);
//        nums.add(7);
//        nums.add(9);
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);


        java.util.Comparator<Integer> com = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        // sort by last digit
        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
