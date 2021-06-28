package Arrays;

import java.util.*;
class JumpGame{
    static boolean canJump(int[] nums){
        int reach = 0;
        for(int i = 0; i <= reach; i++){
            reach = Math.max(reach, i + nums[i]);
            if(reach >= nums.length-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(canJump(arr));
    }
}