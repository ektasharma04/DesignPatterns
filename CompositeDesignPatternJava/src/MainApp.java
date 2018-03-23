import java.util.Scanner;


public class MainApp {

	public static void main(String args[])
	{
		ListBuilder builder = new ListBuilder();
		System.out.println("Please input a list");
		Scanner src = new Scanner(System.in);
		String input=src.nextLine();
		String a[]=input.split("\\s+");
		int inpLength=a.length;
		//for(i=0;i<)
		for(int i=0;i<inpLength;i++)
		{
			//System.out.println(a[i]);
			 if (a[i].equalsIgnoreCase("("))
			 { builder.buildOpenBracket();
			 }
			 else if (a[i].equalsIgnoreCase(")")) {builder.buildCloseBracket();}
			    else if(checkNumber(a[i])) {builder.buildElement(Integer.parseInt(a[i]));}
			
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
