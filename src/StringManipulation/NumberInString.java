package StringManipulation;

public class NumberInString {

	public static void main(String[] args) {

		String str = "Find a number 1234";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}

	}

}
