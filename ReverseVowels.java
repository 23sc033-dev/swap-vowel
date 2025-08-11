public class ReverseVowels {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = reverseVowels(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed vowels: " + result);
    }

    public static String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int left = 0, right = a.length - 1;

        while (left < right) {
            while (left < right && !(a[left] == 'a' || a[left] == 'e' || a[left] == 'i' || a[left] == 'o' || a[left] == 'u'
                    || a[left] == 'A' || a[left] == 'E' || a[left] == 'I' || a[left] == 'O' || a[left] == 'U')) {
                left++;
            }
            while (left < right && !(a[right] == 'a' || a[right] == 'e' || a[right] == 'i' || a[right] == 'o' || a[right] == 'u'
                    || a[right] == 'A' || a[right] == 'E' || a[right] == 'I' || a[right] == 'O' || a[right] == 'U')) {
                right--;
            }
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
        return new String(a);
    }
}
