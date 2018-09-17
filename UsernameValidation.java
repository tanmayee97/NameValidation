import java.util.Scanner;

public class UsernameValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name :");
		String a=sc.next();
		namevalid(a);
	}

		public static boolean namevalid(String s)
		{
			int i=2;
			if(s.length()>=3)
			{
				while(i<s.length())
				{
				if(s.charAt(0)>=65 && s.charAt(0)<=90)
				{
					if(s.indexOf('a')==1 || s.indexOf('e')==1 ||s.indexOf('i')==1 ||s.indexOf('o')==1 ||s.indexOf('u')==1 ||s.indexOf('y')==1)
					{
						System.out.println("Name is accepted with Vowel");
					}
					else
					{
						System.out.println("There are no vowels in given name");
					}
					break;
				}
				else if(s.charAt(i)>=48 && s.charAt(i)<=57)
				{
					System.out.println("Please enter only characters");
					break;
				}
		
			else
			{
				System.out.println("Enter valid name");
				break;
			}
		 }
				
		}
			else
			{
				System.out.println("Atleast three characters are to be given");
			}
				return true;
				}
				}


