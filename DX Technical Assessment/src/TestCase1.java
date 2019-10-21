
public class TestCase1 {

	public static void main(String[] args) {
		String str = "madam";
	    if(isPalindrome(str)) {
	        System.out.println("Palindrome");
	    } else {
	        System.out.println("Not a Palindrome");
	    }
	}

	private static boolean isPalindrome(String str) {
	    // Convert String to char array
	    char[] charArray = str.toCharArray();  
	    for(int i=0; i < str.length(); i++) {
	        if(charArray[i] != charArray[(str.length()-1) - i]) {
	            return false;
	        }
	    }
	    return true;
}
}
