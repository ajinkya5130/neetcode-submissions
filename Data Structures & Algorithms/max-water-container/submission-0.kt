class Solution {
    fun maxArea(heights: IntArray): Int {
        var res = 0
        var left = 0
        var right = heights.size - 1

        while(left < right){
            val area = (right - left) * min(heights[left], heights[right])
            res = max(area, res)

            if(heights[left] < heights[right])
                left++
            else
                right--
        }
        return res
        
    }
}
