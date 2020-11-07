// Compile here ---> https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0#
import java.util.*;
import java.lang.*;
import java.io.*;
class Longest PalindromeINaString
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int tcase=sc.nextInt();
	 sc.nextLine();
	 for(int no=0; no<tcase; no++){
	     String str=sc.nextLine();
	     boolean[][] dp=new boolean[str.length()][str.length()];
	     //int len=0;
	     String result="";
	     for(int g=0; g<str.length(); g++){
	         for(int i=0, j=g; j<str.length(); i++, j++){
	             if(g==0){
	                 dp[i][j]=true;
	             }else if(g==1){
	                 if(str.charAt(i)==str.charAt(j)){
	                     dp[i][j]=true;
	                 }else{
	                     dp[i][j]=false;  
	                 }
	             }else{
	                if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true){
	                     dp[i][j]=true;
	                }else{
	                     dp[i][j]=false;
	                }
	             }
	             if(dp[i][j]){
	                if(str.substring(i,j+1).length()>result.length()){
	              result=str.substring(i,j+1);
	                }
	             }
	            
	         }
	     }
	    System.out.println(result);
	    }
	 }
}
