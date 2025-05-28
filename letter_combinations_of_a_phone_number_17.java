class letter_combinations_of_a_phone_number_17 {
    static String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return findCombinations(digits, "");
    }

    static ArrayList<String> findCombinations(String digits, String pro) {
        if(digits.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        char dig = digits.charAt(0);
        int ind = dig - '0';
        String str = arr[ind];

        ArrayList<String> array = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            array.addAll(findCombinations(digits.substring(1), pro + str.charAt(i)));
        }

        return array;
    }

    public static void main(String args[]) {
        String digits1 = "23", digits2 = "", digits3 = "2";

        System.out.println(letterCombinations(digits1));
        System.out.println(letterCombinations(digits2));
        System.out.println(letterCombinations(digits3));
    }
}


// Example 1:

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

// Example 2:

// Input: digits = ""
// Output: []

// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

