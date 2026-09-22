class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) {
            return false
        }

        val map = HashMap<Char, Int>()

        for (char in s) {
            map[char] = map.getOrDefault(char, 0) + 1
        }

        for (char in t) {
            map[char] = map.getOrDefault(char, 0) - 1
        }

        for (count in map.values) {
            if (count != 0) {
                return false
            }
        }

        return true
    }
}