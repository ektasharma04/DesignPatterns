import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ContactFinder {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DataManager dataManager;//=new DataManager();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void findContact(DataManager dataManager) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.dataManager=dataManager;
		ArrayList<Contact> hs=null;
		hs=dataManager.load();
		//System.out.println("1. Find by first name \n2. Find by last name");
		
	//	int choice=0;
		Scanner src=new Scanner(System.in);
		//choice=src.nextInt();
		System.out.println("current size "+hs.size());
		System.out.println("Please enter a first name or last name to search");
		String search=src.nextLine();
		
	      for(Contact c:hs)
	        {
	        	if(c.getFirstName().equals(search)||c.getLastName().equals(search))
	        	{
	        		System.out.println(c.toString());
	        		
	        	}
	        }
		
		
		// end-user-code
	}
}