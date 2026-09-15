// Problem: 1. Two Sum
// Topic: Arrays & Hash Maps

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for ((index, num) in nums.withIndex()) {
            val complement = target - num
            if (map.containsKey(complement)) {
                return intArrayOf(map.getValue(complement), index)
            }
            map[num] = index
        }
        return intArrayOf()
    }
}

/*
Approach:
I use a HashMap to store array numbers and their indices.
For each number, I check if (target - number) is already in the map.
If it is found, I return the two indices.
*/