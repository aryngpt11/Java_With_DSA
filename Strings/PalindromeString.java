package Strings;

public class PalindromeString {
    public static boolean Palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        boolean b=Palindrome(str);
        if(b==true){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("given string is not palindrome");
        }
    }
    
}
