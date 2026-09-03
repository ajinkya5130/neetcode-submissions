class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashmap = HashMap<Int,Int>()
        nums.forEachIndexed { index, value ->
            val m = target - value
            if (hashmap.containsKey(m))
                return intArrayOf(hashmap.getValue(m), index)
            hashmap[value] = index
        }

        return intArrayOf(-1,-1)
    }
}
