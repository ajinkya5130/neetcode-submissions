class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
var oldValue = Int.MIN_VALUE
        nums.sorted().onEach { num ->
            if (num == oldValue) {
                return true
            }
            oldValue = num
        }
        return false
    }
}
