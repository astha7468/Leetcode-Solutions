class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, "", mapping, result);

        return result;
    }

    private void backtrack(
        int index,
        String digits,
        String current,
        String[] mapping,
        List<String> result
    ) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {

            backtrack(
                index + 1,
                digits,
                current + ch,
                mapping,
                result
            );
        }
    }
}