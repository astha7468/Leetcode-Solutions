class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        int start = 0;

        while (start < arr.length) {

          
            if (arr[start] == ' ') {
                start++;
                continue;
            }

            int end = start;

            while (end < arr.length && arr[end] != ' ') {
                end++;
            }

           
            int left = start;
            int right = end - 1;

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            start = end;
        }

        return new String(arr);
    }
}