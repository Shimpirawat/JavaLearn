package unit1;

public class P6_Task02_StringInJava {
	
	public static void main(String[] args) {
		
		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
		
	}

}

class StringInJava {
	
		void StringDefination() {
			
			String s = "Hello There!";
			String s1 = new String("hgjhgjf"); 
			
			System.out.println(s);
			
			// Get length of a string
			System.outprintln(s.length());
			
			// loop through a string!
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.chartAt(i));
			}
			String first = "Khushi";
			String second = "Goel";
			
			//Add two strings;
			String third = first + second;
			System.out.println(third);
			
			//compare two strings;
			boolean result1 = first.equals(second);
			System.out.println(result1);
			
		
		}
	}
