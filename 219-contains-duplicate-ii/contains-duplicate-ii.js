/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function (nums, k) {
    const ans = new Map();
    for (let i = 0; i < nums.length; i++) {
        if (ans.has(nums[i])) {
            let prevKey = ans.get(nums[i]);
            if (Math.abs(prevKey - i) <= k) return true;
        }
        ans.set(nums[i], i);
    }
    return false;
};