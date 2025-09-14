class generate_parentheses_22 {
    public List<String> generateParenthesis(int n) {
        String str = "";
        int open = 0, close = 0;
        List<String> res = new ArrayList<>();

        helper(str, n, open, close, res);

        return res;
    }

    static void helper(String str, int n, int open, int close, List<String> res) {
        if(str.length() == n * 2) {
            res.add(str);
            return;
        }

        if(open < n) {
            helper(str + '(', n, open + 1, close, res);
        }

        if(close < open) {
            helper(str + ')', n, open, close + 1, res);
        }
    }
}

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]

// Example 2:

// Input: n = 1
// Output: ["()"]

