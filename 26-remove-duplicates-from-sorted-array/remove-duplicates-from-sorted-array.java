class Solution {
    public int removeDuplicates(int[] nums) {
        // int curr = nums[0];
        // int count = 1;

        // for(int i = 0; i < nums.length; i++) {
        //     if(curr == nums[i]) {
        //         continue;
        //     } else {
        //         nums[count] = nums[i];
        //         curr = nums[i];
        //         count++;
        //     }

        // }
        // return count;

        if(nums.length == 0) {
          return 0;
        }

        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[ans]) {
                ans++;
                nums[ans] = nums[i];
            }
        }
        return ans + 1;
    }
}