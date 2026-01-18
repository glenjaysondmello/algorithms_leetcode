// Compares both strings from right to left by skipping deleted characters using backspace count, achieving O(1) extra space.
class backspace_string_compare_844 {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while(i >= 0 || j >= 0) {
            i = getNextValidIndex(s, i);
            j = getNextValidIndex(t, j);

            if(i < 0 && j < 0) return true;

            if(i < 0 || j < 0) return false;

            if(s.charAt(i) != t.charAt(j)) return false;

            i--;
            j--;
        }

        return true;
    }

    static int getNextValidIndex(String str, int index) {
        int skip = 0;

        while(index >= 0) {
            if(str.charAt(index) == '#') skip++;
            else if(skip > 0) skip--;
            else break;

            index--;
        }

        return index;
    }
}

// Simulates text editing using stacks to build final strings after applying backspaces, then compares the results.
class backspace_string_compare_844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch != '#') stk1.push(ch);
            else if(!stk1.isEmpty()) stk1.pop();
        }

        for(char ch : t.toCharArray()) {
            if(ch != '#') stk2.push(ch);
            else if(!stk2.isEmpty()) stk2.pop();
        }

        return stk1.equals(stk2);
    }
}

// Example 1:
// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".

// Example 2:
// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".

// Example 3:
// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".

