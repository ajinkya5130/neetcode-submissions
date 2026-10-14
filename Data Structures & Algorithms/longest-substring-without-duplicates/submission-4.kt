class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val hash = HashSet<Char>()
        var left = 0
        var res = 0
        s.forEachIndexed{ right , char -> 
            while(char in hash){
                hash.remove(s[left])
                left++
            }
                hash.add(char)
                res = max(res, right-left+1)
        }
        return res
    }
}
