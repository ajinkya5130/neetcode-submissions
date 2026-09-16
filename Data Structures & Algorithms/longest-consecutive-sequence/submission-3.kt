class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val store = nums.toSet()
        var long = 0
        //println("nums: ${nums.toList()}, store: $store, sorted: ${nums.sorted()}")
        store.forEach { num ->
            if (num - 1 !in store) {
                var count = 0
                var curr = num
                while (curr in store) {
                    count++
                    curr++
                }
                long = max(long,count)
            }

        }
        //println("longest: $long")
        return long
    }
}

