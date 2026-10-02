class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
 val hash = HashMap<Int,Int>()
        nums.forEachIndexed { index, i ->
          if(target - i in hash){
              return intArrayOf(hash.getValue(target - i), index)
          }
            hash[i] = index
        }
        return intArrayOf(-1,-1)
    }
}
