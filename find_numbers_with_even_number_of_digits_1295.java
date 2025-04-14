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
