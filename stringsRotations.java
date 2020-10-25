/*package whatever //do not write package name here */
//https://ide.geeksforgeeks.org/LD3QKoHLxd
import java.io.*;

class stringsRotations {
	public static void main (String[] args) {
	String str1 = "AACD"; 
        String str2 = "ACDA"; 
        if(str1.length()==str2.length() && (str1+str1).contains(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
	}
}
