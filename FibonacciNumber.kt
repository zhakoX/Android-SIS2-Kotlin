// Problem: 509. Fibonacci Number
// Topic: Math & Functional Range Operators (Fold)

class Solution {
    fun fib(n: Int): Int {
        if (n <= 1) return n
        return (2..n).fold(Pair(0, 1)) { (prev, curr), _ -> 
            Pair(curr, prev + curr) 
        }.second
    }
}

/*
Approach:
If n is 0 or 1, I return n directly.
For n >= 2, I use Kotlin's fold() function over the range 2..n.
I accumulate a pair of values (prev, curr) and return the second value as the result.
*/