class Solution {
    fun isValid(s: String): Boolean {

        val stack = Stack<Char>()

        for (char in s) {

            if (char == '(') {
                stack.push(')')
            } else if (char == '[') {
                stack.push(']')
            } else if (char == '{') {
                stack.push('}')
            } else {
                if (stack.isEmpty() || stack.pop() != char) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}