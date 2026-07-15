class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        String reverse = "";
        for (int i = original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        return original.equals(reverse);
    }
     public static void main(String[] args) {

        PalindromeNumber obj = new PalindromeNumber();

        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(-121));
        System.out.println(obj.isPalindrome(123));
     }
}