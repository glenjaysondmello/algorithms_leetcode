class product_of_array_except_self_238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            output[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }

    public static void main(String args[]) {
        product_of_array_except_self_238 sol = new product_of_array_except_self_238();
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { -1, 1, 0, -3, 3 };
        System.out.println(sol.productExceptSelf(nums1));
        System.out.println(sol.productExceptSelf(nums2));
    }
}