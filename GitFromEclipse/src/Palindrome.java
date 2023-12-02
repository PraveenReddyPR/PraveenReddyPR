
public class Palindrome {

	public static void main(String[] args) {
		String s="Maadam";
		String rev="";

		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev+=s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		

		
	}

}
