/*package whatever //do not write package name here */

import java.io.*;

class ValidShuffle {
	public static void main (String[] args) {
	String first="ABC",second="LMN",result="";
	if(first.length()!=second.length()){
	    System.out.println("Invalid");
	    System.exit(0);
	}else{
	    for(int i=0; i<first.length(); i++){
	        result+=first.charAt(i);
	        result+=second.charAt(i);
	    }
	}
	   if(result.equals("ALBMCN")){
		System.out.println(result+" is the valid suffel of "+first+" and "+second);
	   }else{
	  System.out.println(result+" is not the valid suffel of "+first+" and "+second);
	}
	}
}
