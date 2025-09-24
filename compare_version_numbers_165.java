class compare_version_numbers_165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int length = Math.max(v1.length, v2.length);

        for(int i = 0; i < length; i++) {
            int n1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int n2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if(n1 < n2) return -1;
            if(n1 > n2) return 1;
        }

        return 0;
    }
}

// Example 1:

// Input: version1 = "1.2", version2 = "1.10"
// Output: -1
// Explanation:
// version1's second revision is "2" and version2's second revision is "10": 2 < 10, so version1 < version2.

// Example 2:

// Input: version1 = "1.01", version2 = "1.001"
// Output: 0
// Explanation:
// Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

// Example 3:

// Input: version1 = "1.0", version2 = "1.0.0.0"
// Output: 0
// Explanation:
// version1 has less revisions, which means every missing revision are treated as "0".

  
