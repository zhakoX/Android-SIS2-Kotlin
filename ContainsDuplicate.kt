// Problem: 217. Contains Duplicate
// Topic: Arrays & Sets

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.distinct().size != nums.size
    }
}

/*
Approach:
I use Kotlin's distinct() function to remove duplicate elements.
Then I compare the size of the new list with the original array size.
If the sizes are different, it means the array had duplicates.
*/