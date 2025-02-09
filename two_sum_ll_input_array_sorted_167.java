class two_sum_ll_input_array_sorted_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        int[] numbers1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] numbers2 = { 2, 3, 4 };
        int target2 = 6;
        int[] numbers3 = { -1, 0 };
        int target3 = -1;
        System.out.println(twoSum(numbers1, target1));
        System.out.println(twoSum(numbers2, target2));
        System.out.println(twoSum(numbers3, target3));
    }
}