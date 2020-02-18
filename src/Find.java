import java.util.Objects;

//Q1.find public boolean find(String s,int i,charc)
//find ("hello",2,"e") --->true 
//find("Trash",4,"a" ---->false
// find ("Trash",4,"5" ---->true
public class Find {
	public static void main(String args[]) {
		
		
		
		int i = 2;
		String c ="e";
		String s = "Hello";
		s = s.substring(i-1,i);
			System.out.println(s);
			
			System.out.println(Objects.equals(s , c)); 
			
			
			
			
			
		}
	

}	

