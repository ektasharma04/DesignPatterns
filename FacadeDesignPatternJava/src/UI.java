import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class UI 
{
	
	public static void main(String args[])
	{
		SystemFacade systemFacade=new SystemFacade();
		Scanner src=new Scanner(System.in);
		int choice=0;
		
		while(choice!=4)
		{
			System.out.println("Please choose an action");
			System.out.println("1. Add contact \n2. Delete contact \n3. Search Contact\n4. Quit");
			choice=src.nextInt();
			try {
			switch(choice)
			{
				
				case 1:	//System.out.println("Please enter ");
						//obj=src.next();
				System.out.println("Please add the following details :1. First name");
				String first, last, address, phone, email;
				first=src.next();
				//Contact c=new Contact();
			//	c.setFirstName(src.nextLine());
				System.out.println("Please add the following details :2. Last name");
				//c.setLastName(src.nextLine());
				last=src.next();
				System.out.println("Please add the following details :3. Address");
				//c.setAddress(src.nextLine());
				address=src.next();
				System.out.println("Please add the following details :4. Phone");
			//	c.setPhone(src.nextLine());
				phone=src.next();
				System.out.println("Please add the following details :5. Email");
				//c.setEmail(src.nextLine());
				email=src.next();
						systemFacade.addContact(first, last, address, phone, email);
						System.out.print("Contact added");
					//	getAllElements(systemFacade);						
						break;
				case 2:	System.out.println("Please enter the contact to delete from the list. Enter first and last name of contact for deleting");
						//obj=src.next();
				String firstName=src.next();
				System.out.println("Last name");
				String lastName=src.next();
				
						systemFacade.deleteContact(firstName, lastName);
						System.out.print("Contact deleted.");
						//getAllElements(systemFacade);		
						break;
				
				case 3:systemFacade.searchContact();	
					//System.out.println("There are "+systemFacade.count()+" objects in the list");					
						break;
			
					
				case 4: break;
				default : break;
		
		}
			}
			catch(Exception e) {System.out.println("Object does not exist or the list is empty");e.printStackTrace();}
			}
		}
	
}