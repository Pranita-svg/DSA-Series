public class Anagram {

	public static void main(String[] args) {
		String s1="rat",s2="tar";boolean b=true,found;
		for(int i=0;i<s1.length();i++) {
			found=false;
			char ch=s1.charAt(i);
			for(int j=0;j<s2.length();j++)
			{
				if(ch==s2.charAt(j)) 
					{found=true;
					break;}
			}
			if(found==false) {
				b=false;
				break;
			}
		}
				
		if(b==true)
			System.out.println("Anagram");
		else
			System.out.println("Not an anagram");

	}
	
}

