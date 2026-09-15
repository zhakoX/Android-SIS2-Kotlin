// Problem: 20. Valid Parentheses
// Topic: Stack & Strings

import java.util.ArrayDeque

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val matchingBracket = mapOf(')' to '(', '}' to '{', ']' to '[')
        
        for (char in s) {
            if (char in matchingBracket.values) {
                stack.push(char)
            } else if (char in matchingBracket.keys) {
                if (stack.isEmpty() || stack.pop() != matchingBracket[char]) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}

/*
Approach:
I use a Stack to check if brackets are closed correctly.
I push opening brackets '(', '{', '[' into the stack.
When I see a closing bracket, I check if it matches the last opening bracket in the stack.
*/