class find_smallest_letter_greater_than_target_744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0, end = n - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % n];

        // if(start == n) {
        //     start = 0;
        // }

        // return letters[start];
    }

    public static void main(String args[]) {
        char[] letters1 = {'c', 'f', 'j'};
        char[] letters2 = {'c', 'f', 'j'};
        char[] letters3 = {'x', 'x', 'y', 'y'};

        char target1 = 'a', target2 = 'c', target3 = 'z';

        System.out.println(nextGreatestLetter(letters1, target1));
        System.out.println(nextGreatestLetter(letters2, target2));
        System.out.println(nextGreatestLetter(letters3, target3));
    }
}

// Example 1:

// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
  
// Example 2:

// Input: letters = ["c","f","j"], target = "c"
// Output: "f"
// Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
  
// Example 3:

// Input: letters = ["x","x","y","y"], target = "z"
// Output: "x"
// Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].


  
