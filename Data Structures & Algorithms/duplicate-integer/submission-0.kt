class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashset = hashSetOf<Int>()

        for (n in nums)
            if(hashset.contains(n))
                return true
            else
                hashset.add(n)

        return false

    }
}
