import java.io.*; 
import java.util.*; 
/** 
 * Клас Lab2 реалізує програму до лабораторної роботи №2 
 * 
 * @author Ihor Berehovskyi 
 * @version 1.0 
 * @since version 1.0 
 * 
 */ 
public class Lab2BerehovskyiKI35
{ 
 /** 
 * Статичний метод main є точкою входу в програму 
 * 
 * @param args 
 * @throws FileNotFoundException 
 * 
 */ 
 public static void main(String[] args) throws FileNotFoundException 
 {
	 int nRows; 
	 char[][] arr; 
	 String filler; 
	
	 Scanner in = new Scanner(System.in); 
	 File dataFile = new File("MyFile.txt"); 
	 PrintWriter fout = new PrintWriter(dataFile); 
	 
	 System.out.print("Enter the size of the square matrix: "); 
	 nRows = in.nextInt(); 
	 in.nextLine(); 
	 
	 arr = new char[nRows][]; 
	 for(int i = 0; i < nRows; i++) 
	 { 
		 if(i+1 <= nRows/2) {
			 arr[i]= new char[i+1]; 
		 }
		 else {
			 arr[i]= new char[nRows-i]; 
		 }
	 }
	 
	 
	 System.out.print("\nEnter a placeholder character: "); 
	 filler = in.nextLine(); 
	 
	 exit:
		    for(int i=0; i<nRows; i++) {
		      for(int j=0; j<arr[i].length; j++)
		      {
		        if(filler.length()==1) {
		          arr[i][j]=(char)filler.codePointAt(0);  
		        }
		        else if(filler.length()==0) {
		          System.out.println("No character entered");
		          break exit;
		        }
		        else {
		          System.out.println("Too many character entered");
		          break exit;
		        }
		      }
		  
		      for(int gap=0; gap < nRows - arr[i].length; gap++)
		      {
		        System.out.print(" " + " ");
		        fout.print(" " + " ");
		      }
		      for(int c=0; c < arr[i].length; c++) {
		        
		          System.out.print(arr[i][c]+ " ");
		          fout.print(arr[i][c]+ " ");
		      }
		      
		      fout.print("\n");
		      System.out.print("\n");
		 } 
		 fout.flush(); 
		 fout.close(); 
		 
	 } 
}