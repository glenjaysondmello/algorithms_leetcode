class number_of_steps_to_reduce_a_number_to_zero_1342 {
    public static int numberOfSteps(int num) {
        int step = 0;
        return helper(num, step);
    }

    static int helper(int num, int step) {
        if(num == 0) {
            return step;
        }
        if((num & 1) == 0) {
            return helper(num / 2, ++step);
        } else {
            return helper(num - 1, ++step);
        }
    }

    public static void main(String args[]) {
        int num1 = 14, num2 = 8, num3 = 123;

        System.out.println(numberOfSteps(num1));
        System.out.println(numberOfSteps(num2));
        System.out.println(numberOfSteps(num3));
    }
}


// Example 1:

// Input: num = 14
// Output: 6
// Explanation: 
// Step 1) 14 is even; divide by 2 and obtain 7. 
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3. 
// Step 4) 3 is odd; subtract 1 and obtain 2. 
// Step 5) 2 is even; divide by 2 and obtain 1. 
// Step 6) 1 is odd; subtract 1 and obtain 0.
  
// Example 2:

// Input: num = 8
// Output: 4
// Explanation: 
// Step 1) 8 is even; divide by 2 and obtain 4. 
// Step 2) 4 is even; divide by 2 and obtain 2. 
// Step 3) 2 is even; divide by 2 and obtain 1. 
// Step 4) 1 is odd; subtract 1 and obtain 0.
  
// Example 3:

// Input: num = 123
// Output: 12

