class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;
        int n = nums.length - 1;
        if (nums[0] < nums[n])cnt++;
        for (int i = 0; i < n; i++) {
            if (nums [i] > nums[i+1])cnt++;
        }
        if (cnt > 1)return false;
        else return true;
    }
}