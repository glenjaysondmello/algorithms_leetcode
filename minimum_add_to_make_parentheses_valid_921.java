class minimum_add_to_make_parentheses_valid_921 {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == ')') {
                if(!stk.isEmpty() && stk.peek() == '(') {
                    stk.pop();
                } else {
                    stk.push(ch);
                }
            } else {
                stk.push(ch);
            }
        }

        return stk.size();
    }
}


// Example 1:

// Input: s = "())"
// Output: 1
  
// Example 2:

// Input: s = "((("
// Output: 3

