// This is the Brute force solution. This solution is not recommended

class count_good_numbers_1922 {
    public static int countGoodNumbers(long n) {
        long start, end;
        int count = 0;

        start = (long) 0;

        end = (long) Math.pow(10, n) - 1;

        while (start <= end) {
            String str_start = String.format("%0" + n + "d", start);

            // String str_start = Integer.toString(start);

            // while (str_start.length() < n) {
            // str_start = '0' + str_start;
            // }

            if (str_start.charAt(0) % 2 != 0) {
                start++;
                continue;
            }

            if (n != 1) {
                if (str_start.length() % 2 != 0) {
                    if (str_start.charAt(str_start.length() - 1) % 2 == 0) {
                        start++;
                        continue;
                    }
                } else {
                    if (!isPrimeN(str_start.length() - 1)) {
                        start++;
                        continue;
                    }
                }
            }

            boolean even = true, prime = true;

            for (int i = 0; i < str_start.length(); i++) {
                if (i % 2 == 0) {
                    even &= isEven(str_start.charAt(i));
                } else {
                    prime &= isPrime(str_start.charAt(i));
                }
            }

            if (even && prime) {
                count++;
            }

            start++;
        }
        return count;
    }

    static boolean isEven(char s) {
        int n = Character.getNumericValue(s);
        boolean b = (n & 1) == 0 ? true : false;
        return b;
    }

    static boolean isPrime(char s) {
        int n = Character.getNumericValue(s);
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static boolean isPrimeN(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static void main(String args[]) {
        int n1 = 1; 
        int n2 = 4;
        // int n3 = 50;
        System.out.println(countGoodNumbers(n1)); // Executes
        System.out.println(countGoodNumbers(n2)); // Executes
        // System.out.println(countGoodNumbers(n3)); // Time limit exceeds
    }
}

// Example 1:

// Input: n = 1
// Output: 5
// Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".

// Example 2:

// Input: n = 4
// Output: 400

// Example 3:

// Input: n = 50
// Output: 564908303
 
