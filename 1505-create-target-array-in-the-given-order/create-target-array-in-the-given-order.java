class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> ans = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i], nums[i]);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}