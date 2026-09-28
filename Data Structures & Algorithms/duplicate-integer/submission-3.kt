class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false
        var a =0
        val sorted = nums.sorted()
//        println("nums: ${nums.toList()}, sorted: ${nums.sorted()}")
//        println("after sorted : ${sorted.toList()}")
        while (a < sorted.size - 1) {
            if (sorted[a] == sorted[a + 1]) return true
            else a++
        }
        return false
    }
}
