class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sortedArray = nums.sorted()
        var list = mutableSetOf<List<Int>>()
        //[-4, -1, -1, 0, 1, 2]
        sortedArray.forEachIndexed{ index, value -> 
        var left = index+ 1
        var right = sortedArray.size - 1
        while(left < right){
            val sum = value + sortedArray[left] + sortedArray[right]
            if(sum == 0){
                list.add(listOf(value, sortedArray[left], sortedArray[right]))
                left++
            }else if (sum > 0){
                right--
            }else{
                left++
            }
        }
        }
    return list.toList()
    }
}
