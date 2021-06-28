package Arrays;

import java.util.*;
public class JumpGame2 {
    static int jump(int[] nums){
        int reach = 0, count = 0;
        boolean flag = false;
        for(int i = 0; i <= reach; i++){
            if((i+nums[i]) > reach){
                reach = i+nums[i];
                count++;
            }
            if(reach >= nums.length-1){
                flag = true;
            }
            if(flag == true){
                return count;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(jump(arr));
    }
}
