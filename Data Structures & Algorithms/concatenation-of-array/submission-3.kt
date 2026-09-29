class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val length = nums.size
        val ans = IntArray(2*length)

for(i in nums.indices){
ans[i] = nums[i]
        ans[i + length] = nums[i]
}
        return ans

    }
}
