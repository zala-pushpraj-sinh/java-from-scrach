import java.util.*;

class SB
{
	public static void main(String [] args)
	{
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);	
		
		// char at any index
		System.out.println(sb.charAt(0));
		
		// replace any char
		sb.setCharAt(0,'h');
		System.out.println(sb);
		
		// insert at any index
		sb.insert(5,' ');
		sb.insert(6,'b');
		sb.insert(7,'r');
		sb.insert(8,'o');
		System.out.println(sb);
	
		// delete any element or Substring
		sb.delete(0,6);
		System.out.println(sb);
		
		// append add at last
		sb.append(' ');
		sb.append('h');
		sb.append('i');
		System.out.println(sb);
		
		// find length
		System.out.println(sb.length());
	}
}