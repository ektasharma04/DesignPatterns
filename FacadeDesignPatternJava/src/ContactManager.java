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
public class ContactManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	Scanner src=new Scanner(System.in);
	//private DataManager dataManager;//\\=new DataManager();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Contact addContact(String first, String last, String address, String phone, String email) {
		// begin-user-code
		// TODO Auto-generated method stub
		//System.out.println("Please add the following details :1. First name");
		Contact c=new Contact();
		c.setFirstName(first);
		
		c.setLastName(last);
		
		c.setAddress(address);
		
		c.setPhone(phone);
		
		c.setEmail(email);
		
		//System.out.println("Do you want to save the contact?(y/n)");
		return c;

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<Contact> deleteContact(String firstName, String lastName,ArrayList<Contact> hs) {
		// begin-user-code
		// TODO Auto-generated method stub
		ArrayList<Contact> hsh=null;
		try {
			hsh=new ArrayList();
		int size=hsh.size();
		int index=0;
		System.out.println(hs.size());
       for(Contact c:hsh )
        {
        	if(c.getFirstName().equals(firstName)&&c.getLastName().equals(lastName))
        	{
        		hsh.remove(index);
        		/*hs.remove(i.next().getFirstName());
        		hs.remove(i.next().getLastName());
        		hs.remove(i.next().getPhone());
        		hs.remove(i.next().getEmail());*/
        	}index++;
        }
       System.out.println(hs.size());
       // return 
       // Iterator<Contact> i = hs.iterator();
       /* while (i.hasNext())
        {
        	
        	
        		System.out.println(i.next().getFirstName());
        		System.out.println(i.next().getLastName());
        		System.out.println(i.next().getAddress());
        		System.out.println(i.next().getPhone());
        		System.out.println(i.next().getEmail());
        	
        }*/}
		catch(Exception e) {System.out.println("Deleting error");e.printStackTrace();}
		// end-user-code
		return hsh;
	}
}