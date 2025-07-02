class count_symmetric_integers_2843 {
    public static int countSymmetricIntegers(int low, int high) {
        int len, n, num1, num2, count = 0;
        for(int i = low; i <= high; i++) {
            String str = Integer.toString(i);
            len = str.length();
            if(len % 2 == 0) {
                n = len / 2;
                num1 = Integer.parseInt(str.substring(0, n));
                num2 = Integer.parseInt(str.substring(n));
                if(sumOfNum(num1) == sumOfNum(num2)) {
                    count++;
                }
            }
        }
        return count;
    }

    static int sumOfNum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        int low1 = 1, high1 = 100;
        int low2 = 1200, high2 = 1230;
        System.out.println(countSymmetricIntegers(low1, high1));
        System.out.println(countSymmetricIntegers(low2, high2));
    }
}

// Example 1:

// Input: low = 1, high = 100
// Output: 9
// Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.

// Example 2:

// Input: low = 1200, high = 1230
// Output: 4
// Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
