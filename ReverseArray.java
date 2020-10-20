import java.util.*;
import java.lang.*;
import java.io.*;
class ReverseArray
 {
	public static void main (String[] args)
	 {
	 //code
	Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
while(T-->0){
String s = sc.next();
char c[] = s.toCharArray();
for(int i = s.length()-1 ; i>=0 ; i--){
System.out.print(c[i]);
}
System.out.println();
}
	 
	 
	 }
}
