class Solution{
    fun fib(n: Int): Int {
        if(n<=1){
            return n
        }
        var prev = 0
        var current = 1
        for(i in 2..n){
            var next = prev + current
            prev = current
            current = next
        }
        return current
    }
}