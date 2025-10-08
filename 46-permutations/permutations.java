class Solution {

    private void canPermute(int ind, int[] nums, List<List<Integer>> ans) {
        if (ind == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            // return ans;
        }
        
        for (int i = ind; i < nums.length; i++) {
            swap(nums, i, ind);
            canPermute(ind + 1, nums, ans);
             swap(nums, i, ind);
        }
        // return ans;

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        canPermute(0, nums, ans);
        return ans;
    }
}