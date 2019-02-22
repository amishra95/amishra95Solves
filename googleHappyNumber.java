/**
 * Q.1: Consider any integer ending in 0 to be “magic”.  Write a function which accepts an integer, sums the squares of the digits of the integer, 
and determines if the sum ends in zero. If it ends in zero print “Magic”. Otherwise, try again with the sum.


# Asked multiple follow-up questions and pushed to get better time and space complexity. Also made sure code is ready to compile and with no errors.
# Towards the end he gave me 5 mins for questions but ended up talking for over 10 mins and bonded over the culture at google and how they get projects.

 * @author Avanish Mishra
 *
 */
public class googleHappyNumber {

	public static void main(String[] args) {
		findIfMagic(10);
	}
	
	
	public static void findIfMagic(int num) {
		int sum = 0;
		
		int num1 = Math.abs(num);
			if(num % 10 == 0) {
			System.out.print("magic");
		}
			
			String number = String.valueOf(num);
			String[] digits2 = number.split("(?<=.)");
		for(int i = 0; i <digits2.length; i++) {
			int	digits2[i] = (int) Math.pow(digits2[i], 2);
			
			int sum += digits2[i];
			
		}
		
		if(sum % 10 == 0) {
			System.out.print("magic");
		}
		
			
	}
	
	
	
}
