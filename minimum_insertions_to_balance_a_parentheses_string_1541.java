class minimum_insertions_to_balance_a_parentheses_string_1541 {
    public int minInsertions(String s) {
        Stack<Character> stk = new Stack<>();
        int len = s.length();
        int insertions = 0;
        int i = 0;

        while(i < len) {
            char ch = s.charAt(i);

            if(ch == '(') {
                stk.push(ch);
                i++;
            } else {
                if(i + 1 < len && s.charAt(i + 1) == ')') {
                    if(!stk.isEmpty()) {
                        stk.pop();
                    } else {
                        insertions++;
                    }

                    i += 2;
                } else {
                    if(!stk.isEmpty()) {
                        stk.pop();
                        insertions++;
                    } else {
                        insertions += 2;
                    }

                    i++;
                }
            }
        }

        insertions += stk.size() * 2;

        return insertions;
    }
}


// Example 1:

// Input: s = "(()))"
// Output: 1
// Explanation: The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.

// Example 2:

// Input: s = "())"
// Output: 0
// Explanation: The string is already balanced.

// Example 3:

// Input: s = "))())("
// Output: 3
// Explanation: Add '(' to match the first '))', Add '))' to match the last '('.

