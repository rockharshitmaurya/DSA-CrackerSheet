import java.util.*;
import java.lang.*;
import java.io.*;
class KthSmallestElement
 {
	public static void main (String[] args)throws IOException
	 {
	 //code
BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	int tcase = Integer.parseInt(read.readLine());
	while(tcase-->0){
	 int size1 = Integer.parseInt(read.readLine());
	String[] S = read.readLine().split(" ");
	 int find1= Integer.parseInt(read.readLine());
	 int [] arr = new int [size1];
	 for(int i=0; i<size1; i++) {
         arr[i] = Integer.parseInt(S[i]);
      }
      Arrays.sort(arr);
      // System.out.println(Arrays.toString(arr));
     for(int i=0; i<size1; i++) {
        if(i==find1-1){
            System.out.println(arr[i]); 
           // System.out.println("arr[find1] "+find1); 
        }
      }
	
	}
	 }
}
