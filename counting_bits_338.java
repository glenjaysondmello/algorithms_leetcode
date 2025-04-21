class counting_bits_338 {
    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            int count = 0, c = i;
            while(c > 0) {
                count += c & 1;
                c >>= 1;
            }
            arr[i] = count;
        }

        return arr;
    }

    public static void main(String args[]) {
        int n1 = 2, n2 = 5;

        System.out.println(Arrays.toString(countBits(n1))); 
        System.out.println(Arrays.toString(countBits(n2))); 
    }
}

// Example 1:

// Input: n = 2
// Output: [0,1,1]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
  
// Example 2:

// Input: n = 5
// Output: [0,1,1,2,1,2]
// Explanation:
// 0 --> 0
// 1 --> 1
// 2 --> 10
// 3 --> 11
// 4 --> 100
// 5 --> 101

  
