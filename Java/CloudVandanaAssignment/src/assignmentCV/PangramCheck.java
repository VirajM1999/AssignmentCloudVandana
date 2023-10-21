package assignmentCV;

public class PangramCheck {	 
	    static int size = 26;
	    static boolean singleLetter(char ch)
	    {
	        if (!Character.isLetter(ch))
	            return false;
	 
	        return true;
	    }
	
	    static boolean fullString(String str,int len)
	    {
	        str = str.toLowerCase();
	 
	        boolean[] present = new boolean[size];
	 
	        for (int i = 0; i < len; i++) {
	 
	            
	            if (singleLetter(str.charAt(i))) {
	 
	                
	                int letter = str.charAt(i) - 'a';
	                present[letter] = true;
	            }
	        }
	        for (int i = 0; i < size; i++) {
	 
	           
	            if (!present[i])
	                return false;
	        }
	        return true;
	    }
	 
	    public static void main(String args[])
	    {
	 
	       
	        String str = "Pack my box with five dozen liquor jugs.";
	        int len = str.length();
	 
	       
	        if (fullString(str, len))
	            System.out.println("string is panagram");
	        else
	            System.out.println("string is not pangram");
	    }
	}


