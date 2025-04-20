class plus_one_66 {
    public static int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
            
            // if(i > 0) {
            //     arr[i] = digits[i];
            // }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] digits1 = {1,2,3};
        int[] digits2 = {4,3,2,1};
        int[] digits3 = {9};

        System.out.println(plusOne(digits1));
        System.out.println(plusOne(digits2));
        System.out.println(plusOne(digits3));
    }
}

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].

// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

  
