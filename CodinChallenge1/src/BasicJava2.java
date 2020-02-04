
public class BasicJava2 {
		public static boolean match(char lowerCaseChar, char upperCaseChar) {
			if('a'<=lowerCaseChar && 'z'>=lowerCaseChar)  {
				return true;
			}
			if(upperCaseChar>='A' && upperCaseChar<='Z') {
				return true;
			}
			if(lowerCaseChar==upperCaseChar) {
				return true;
			}
			else {
				return false;
			}
		}
		public static long ceiling(double num) {
			long newNum = (int)num;
			return newNum;
		}
		public static int count(String str, String chars) {
			return 0;
		}
		public static int addHexDigits(int num) {
			int digit=0;
			int sum = 0;
			while(num!=0) {
			digit = num%10;
			sum = sum + digit;
			num = num/10;
			}
			return sum;
	}

}
