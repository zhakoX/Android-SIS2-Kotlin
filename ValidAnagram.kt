// Problem: 242. Valid Anagram
// Topic: Strings & Hash Maps

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.groupingBy { it }.eachCount() == t.groupingBy { it }.eachCount()
    }
}

/*
Approach:
I first check if both strings have the same length.
I use groupingBy { it }.eachCount() to count how many times each character appears.
Then I compare the two result maps using ==.
*/