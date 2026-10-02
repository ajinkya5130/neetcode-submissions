class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var a = 0
        nums.forEach { i ->
            if (i != `val`) {
                nums[a] = i
                a++
            }
        }  
        return a
    }
}
