package test24;

import java.util.Scanner;

public class JumpFloor {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
     * （先后次序不同算不同的结果）。
     * @param target 输入的台阶数
     * @return
     */

    public static int DanceSteps(int target) {
        if (target == 0 || target == 1)
            return 1;
        return DanceSteps(target - 1) + DanceSteps(target - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.println("请输入台阶数： ");
        System.out.println(DanceSteps(target));
    }


}
