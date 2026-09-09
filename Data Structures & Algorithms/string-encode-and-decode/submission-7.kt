class Solution {

    fun encode(strs: List<String>): String {
        val res = StringBuilder()
        for (str in strs) {
            res.append(str.length).append('#').append(str)
        }
        return res.toString()
    }

    fun decode(encoded: String): List<String> {
        val res = mutableListOf<String>()
        var i = 0
        while (i < encoded.length) {
            var j = i
            while (encoded[j] != '#') {
                j++
            }
            val length = encoded.substring(i, j).toInt()
            i = j + 1
            res.add(encoded.substring(i, i + length))
            i += length
        }
        return res
    }
}