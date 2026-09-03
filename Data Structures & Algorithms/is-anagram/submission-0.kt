class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val hash = HashMap<String,Int>()
        var isAnagram = true

        s.forEachIndexed { index,  ch ->
            if(hash.containsKey(ch.toString()))
                hash[ch.toString()] = hash.getValue(ch.toString()) + 1
            else
                hash[ch.toString()] = 1

            if (hash.containsKey(t[index].toString()))
                hash[t[index].toString()] = hash.getValue(t[index].toString()) - 1
            else
                hash[t[index].toString()] = -1
        }

         hash.forEach { string, i ->
            println("ch: $string, count: $i")
            if (i>0){
                isAnagram = false
            }
        }

        return isAnagram
    }
}
