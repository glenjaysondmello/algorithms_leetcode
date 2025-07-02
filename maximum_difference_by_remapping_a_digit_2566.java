// (Optimized)

class maximum_difference_by_remapping_a_digit_2566 {
    public static int minMaxDifference(int num) {
        String str = Integer.toString(num);

        int max = getMaxNum(str);
        int min = getMinNum(str);

        return max - min;
    }

    static int getMaxNum(String str) {
        for(char ch : str.toCharArray()) {
            if(ch != '9') {
                String newStr = str.replace(ch, '9');
                return Integer.parseInt(newStr);
            }
        }

        return Integer.parseInt(str);
    }

    static int getMinNum(String str) {
        for(char ch : str.toCharArray()) {
            if(ch != '0') {
                String newStr = str.replace(ch, '0');
                return Integer.parseInt(newStr);
            }
        }

        return Integer.parseInt(str);
    }

    public static void main(String args[]) {
        int num1 = 11891, num2 = 90;

        System.out.println(minMaxDifference(num1));
        System.out.println(minMaxDifference(num2));
    }
}

// (checks every digits - Not Optimized)

class maximum_difference_by_remapping_a_digit_2566 {
    public static int minMaxDifference(int num) {
        String str = Integer.toString(num);
        String str1 = str, str2 = str;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        // ArrayList<Character> arr = new ArrayList<>();

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != '9') {
                // if(arr.contains(str1.charAt(i))) {
                //     continue;
                // }
                for(int j = 0; j < str1.length(); j++) {
                    if(str.charAt(j) == str1.charAt(i)) {
                        str1 = str1.replace(str1.charAt(j), '9');
                        // arr.add(str1.charAt(j));
                    }
                    n1 = Integer.parseInt(str1);
                    if(n1 > max) {
                        max = n1;
                    }
                }
                str1 = str;
            }
        }

        // arr.clear();

        if(max == Integer.MIN_VALUE) {
            max = num;
        }

        for(int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) != '0') {
                // if(arr.contains(str2.charAt(i))) {
                //     continue;
                // }
                for(int j = 0; j < str2.length(); j++) {
                    if(str2.charAt(j) == str2.charAt(i)) {
                        str2 = str2.replace(str2.charAt(j), '0');
                        // arr.add(str2.charAt(j));
                    }
                    n2 = Integer.parseInt(str2);
                    if(n2 < min) {
                        min = n2;
                    }
                }
                str2 = str;
            }
        }

        if(min == Integer.MAX_VALUE) {
            min = num;
        }

        return max - min;
    }

    public static void main(String args[]) {
        int num1 = 11891, num2 = 90;

        System.out.println(minMaxDifference(num1));
        System.out.println(minMaxDifference(num2));
    }
}


// Example 1:

// Input: num = 11891
// Output: 99009
// Explanation: 
// To achieve the maximum value, Bob can remap the digit 1 to the digit 9 to yield 99899.
// To achieve the minimum value, Bob can remap the digit 1 to the digit 0, yielding 890.
// The difference between these two numbers is 99009.
  
// Example 2:

// Input: num = 90
// Output: 99
// Explanation:
// The maximum value that can be returned by the function is 99 (if 0 is replaced by 9) and the minimum value that can be returned by the function is 0 (if 9 is replaced by 0).
// Thus, we return 99.


