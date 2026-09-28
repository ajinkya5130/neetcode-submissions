class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
if (nums.isEmpty()) return false
        var a =0
        nums.sorted()
        while (a < nums.size - 1) {
            if (nums[a] == nums[a + 1]) return true
            else a++
        }
        return false
    }
}
