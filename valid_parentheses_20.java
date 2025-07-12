class valid_parentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if(ch == ')') {
                    if(stk.isEmpty() || stk.pop() != '(') return false;
                }

                if(ch == ']') {
                    if(stk.isEmpty() || stk.pop() != '[') return false;
                }

                if(ch == '}') {
                    if(stk.isEmpty() || stk.pop() != '{') return false;
                }
            }
        }

        return stk.isEmpty();
    }
}


// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

