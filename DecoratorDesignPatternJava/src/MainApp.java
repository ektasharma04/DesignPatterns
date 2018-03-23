import java.util.Scanner;


public class MainApp 
{

	public static void main(String args[]) throws Exception
	{
		ListBuilder builder = new ListBuilder();
		System.out.println("Input please");
		Scanner src = new Scanner(System.in);
		String input=src.nextLine();
		String a[]=input.split("\\s+");
		int inpLength=a.length;
		//String temp=Character.toString(input.charAt(token));
		for(int i=0;i<input.length();i++)
		{
			//System.out.println(a[i]);
			String character=Character.toString(input.charAt(i));
			 if (character.equals("["))
			 { 
				 builder.buildOpenBracket();
				// System.out.println("called buildOpenBracket");
			 }
			 else if (character.equals("]")) 
			 {
				 builder.buildCloseBracket();
				// System.out.println("called buildCloseBracket");
			 }
			    else if(checkNumber(character)) 
			    {
			    	int b= Integer.parseInt(character);
			    	builder.buildElement(b);
			    	//System.out.println("called buildElement");
			    }
		}
		ListComponent list = builder.getList();
		list.printValue();
		
			
		
	}
	public static boolean checkNumber(String token)
	{
		try
	    {
	        Integer.parseInt(token);
	    }
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	    return true;
		
		
	}
}
