class Solution {
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
