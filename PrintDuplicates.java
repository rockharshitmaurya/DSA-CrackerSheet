/*package whatever //do not write package name here */
//some error
import java.io.*;

class PrintDuplicates {
	public static void main (String[] args) {
	String name="geeksforgeeks";
	int len=name.length()-1,count=0;
	char[] arr=new  char[len+1];
	for(int i=0; i<=len; i++){
	for(int j=i; j<=len; j++){
	if(name.charAt(i)==name.charAt(j)){
    count++;
	}
	} 
	if(count>=2)
	{
	System.out.println("count["+name.charAt(i)+"]=="+count);
	}
	count=0;
//     arr[i]=name.charAt(i);
//     for(int j=i; j<=arr.length-1; j++){
//     if(name.charAt(i)==arr[j]){
//     System.out.println("s");
// 	    }
// 	   break;
//     }
	}
	}
}
