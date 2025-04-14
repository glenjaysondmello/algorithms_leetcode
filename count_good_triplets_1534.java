class count_good_triplets_1534 {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(positive(arr[i] - arr[j]) <= a) {
                    for(int k = j + 1; k < arr.length; k++) {
                        if(positive(arr[j] - arr[k]) <= b) {
                            if(positive(arr[i] - arr[k]) <= c) {
                                count++;
                            }
                        }
                    }
                }
            }
        } 
        return count;
    }

    // can also use Math.abs() instead of positive function

    static int positive(int num) {
        if(num < 0) {
            num *= -1;
        }
        return num;
    }

    public static void main(String args[]) {
        int[] arr1 = {3,0,1,1,9,7};
        int a1 = 7, b1 = 2, c1 = 3;

        int[] arr2 = {1,1,2,2,3}; 
        int a2 = 0, b2 = 0, c2 = 1;

        System.out.println(countGoodTriplets(arr1, a1, b1, c1));
        System.out.println(countGoodTriplets(arr2, a2, b2, c2));
    }
}

// Example 1:

// Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
// Output: 4
// Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].

// Example 2:

// Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
// Output: 0
// Explanation: No triplet satisfies all conditions.
 
