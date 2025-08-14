class largest_3_same_digit_number_in_string_2264 {
    public String largestGoodInteger(String num) {
        if(num == "") return num;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i <= num.length() - 3; i++) {
            char c1 = num.charAt(i);
            char c2 = num.charAt(i + 1);
            char c3 = num.charAt(i + 2);

            if(c1 == c2 && c2 == c3) {
                max = Math.max(max, c1 - '0');
            }
        }

        if(max == Integer.MIN_VALUE) return "";

        char m = (char) (max + '0');

        return "" +m+m+m; 
    }
}


// Example 1:

// Input: num = "6777133339"
// Output: "777"
// Explanation: There are two distinct good integers: "777" and "333".
// "777" is the largest, so we return "777".

// Example 2:

// Input: num = "2300019"
// Output: "000"
// Explanation: "000" is the only good integer.

// Example 3:

// Input: num = "42352338"
// Output: ""
// Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.

