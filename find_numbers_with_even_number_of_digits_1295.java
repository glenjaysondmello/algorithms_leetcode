class find_numbers_with_even_number_of_digits_1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            int len = digits(num);
            count += (len & 1) == 0 ? 1 : 0;
        }
        return count;
    }

    static int digits(int num) {
        int count = 0;

        if(num < 0) {
            num *= -1;
        }

        if(num == 0) {
            return 1;
        }

        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
    }
}

<<<<<<< HEAD
=======

>>>>>>> repo-b-temp
// Example 1:

// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.

// Example 2:

// Input: nums = [555,901,482,1771]
// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.
<<<<<<< HEAD
 
=======
>>>>>>> repo-b-temp
