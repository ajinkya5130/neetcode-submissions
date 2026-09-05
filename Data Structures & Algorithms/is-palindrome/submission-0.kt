class Solution {
    fun isPalindrome(s: String): Boolean {
        val value = s.replace("[^a-zA-Z0-9]".toRegex(), "").lowercase()
        //println("before : $s, after value: $value")
        value.forEachIndexed { index, ch ->
            if (value[index] == value[value.length - 1 - index]) {
                if (index == value.length - 1 - index) {
                    return true
                } 
                // else {
                //     println("continue $index, ch: $ch")
                // }
            } else {
                return false
            }
        }
        return true
    }
}
