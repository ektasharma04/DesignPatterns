import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp 
{  
	static GoFListAdapter myList=new GoFListAdapter();
	public static void main(String args[])
	{
		Scanner src=new Scanner(System.in);
		
		int choice=0;
		
		//getAllElements(list);
		String obj="";
		while(choice!=12)
		{
			System.out.println("Please choose one");
			System.out.println("1. Append \n2. Delete \n3. Delete all\n4. Number of elements in list\n5. first object in list\n6. Last object in the list\n7. check if object is in the list\n8. Delete first object from the list\n9. Delete last object from the list\n10. Get object from the list\n11. Insert object to the front of the list\n12. Quit");
			choice=src.nextInt();
			try {
			switch(choice)
			{
				
				case 1:	System.out.println("Please enter the object to add to the list");
						obj=src.next();
						myList.append(obj);
						System.out.print("Object added to the list.\nCurrent elements in list:	");
						getAllElements(myList);						
						break;
				case 2:	System.out.println("Please enter the object to delete from the list");
						obj=src.next();
						myList.delete(obj);
						System.out.print("Object deleted from the list.\nCurrent elements in list:	");
						getAllElements(myList);		
						break;
				case 3:	myList.deleteAll();
						System.out.println("All objects deleted from the list");
						break;
				case 4:	System.out.println("There are "+myList.count()+" objects in the list");					
						break;
				case 5:	System.out.println("First object in the list:	"+myList.first());
						
						break;
				case 6:	System.out.println("Last object in the list"+myList.last());
						break;
				case 7:	System.out.println("Please enter the object to find in the list");
						obj=src.next();
						System.out.println("Object exists in the list:	"+myList.include(obj));
						break;
				case 8:	System.out.println("First object deleted from the list");
						myList.deleteFirst();
						System.out.print("Object deleted from the list.\nCurrent elements in list:	");
						getAllElements(myList);		
						break;
				case 9:	System.out.println("Last object deleted from the list");
						myList.deleteLast();
						System.out.print("Object deleted from the list.\nCurrent elements in list:	");
						getAllElements(myList);	
						break;
				case 10:	System.out.println("Please enter the index for an object in the list");
							int index=src.nextInt();
							System.out.println("Object "+myList.get(index)+ " exists at index "+index+" in the list");
							break;
				case 11: 	System.out.println("Please enter the object to add to the front of the list");
							obj=src.next();
							myList.prepend(obj);
							System.out.print("Object added to the list.\nCurrent elements in list:	");
							getAllElements(myList);	
							break;
				case 12: break;
				default : break;
		
		}
			}catch(Exception e) {System.out.println("Object does not exist or the list is empty");}
			}
		
		
	}
	static void getAllElements(GoFListAdapter list)
	{
		//ArrayList al=list;
		int size=list.count();
		if(size==0) {System.out.println("List empty");}
		//String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			//arr[i]=(String) list.get(i);
			if(i!=size-1)
			System.out.print(list.get(i).toString()+"	");
			else
				System.out.println(list.get(i).toString());
			
		}
		
		//List<String> l=al;
		//System.out.println(al);
		/*for(String obj:al)
		{}*/
	}
}
