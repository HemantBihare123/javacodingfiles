package stringPractice;

public class uppercaseUsingASCII {
	
	
	public static String upperCaseLetterFinder(String str){
		char[] ch = str.toCharArray();
		String str2 ="";
		for(int i=0; i<str.length(); i++) {
			if((int)ch[i]>=65 && (int)ch[i]<=90) {
				str2 = str2+ '\n' + ch[i];
				str2 = str2.trim();
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(upperCaseLetterFinder("HeLlo MoTo"));

	}

}
