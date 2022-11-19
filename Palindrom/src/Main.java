import java.util.Scanner;

public class Main {
	
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
			return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir cümle giriniz: ");
		String sentence = scanner.nextLine();
		
		if(isPalindrome(sentence)) {
			System.out.println("\"" + sentence + "\"" +" cümlesi palindromdur.");
		}else {
			System.out.println("\"" +sentence + "\"" +" cümlesi palindrom değildir.");

		}
	}
}
