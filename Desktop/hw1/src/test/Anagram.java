package test;
import java.util.Arrays;

public class Anagram {
	    static boolean isAnagram(String s1, String s2)
	    {
	       String ss1 = s1.replaceAll("\\s", ""); 
	        String ss2 = s2.replaceAll("\\s", ""); 
	       boolean status = true; 
	        if(ss1.length() != ss2.length())
	        {
	            status = false;
	        }else{
	            char[] s1Array = ss1.toLowerCase().toCharArray(); 
	            char[] s2Array = ss2.toLowerCase().toCharArray();
	            Arrays.sort(s1Array);
	            Arrays.sort(s2Array);
	            status = Arrays.equals(s1Array, s2Array);
	        }
	        return status;
	    }
	 
	    public static void main(String[] args)
	    {	
	    	isAnagram("Toss", "Shot");
	        isAnagram("nagaram", "anagram"); 
	        isAnagram("keEp", "peeK"); 
	        isAnagram("rat", "car");
	    }
	}