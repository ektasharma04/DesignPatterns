import java.util.ArrayList;
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
public class SystemFacade {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//Scanner src=new Scanner(System.util);
	private ContactManager contactManager=new ContactManager();
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ContactFinder contactFinder=new ContactFinder();
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DataManager dataManager=new DataManager();

	
	public void addContact(String first, String last, String address, String phone, String email) {
		// begin-user-code
		// TODO Auto-generated method stub

		Contact c=contactManager.addContact(first, last, address, phone, email);
		saveContacts(c);
		// end-user-code
	}

	
	public void deleteContact(String first, String last) {
		// begin-user-code
		// TODO Auto-generated method stub
		
		ArrayList<Contact> contacts=(contactManager.deleteContact(first, last,loadCContacts()));
		
		for(Contact c:contacts)
		{
			saveContacts(c, false);
		}
		// end-user-code
	}

	
	public void searchContact() {
		// begin-user-code
		// TODO Auto-generated method stub
		contactFinder.findContact(dataManager);
		// end-user-code
	}


	public void saveContacts(Contact C, boolean overwrite) {
		// begin-user-code
		// TODO Auto-generated method stub
		dataManager.save(C, false);
		// end-user-code
	}
	public void saveContacts(Contact C) {
		// begin-user-code
		// TODO Auto-generated method stub
		dataManager.save(C);
		// end-user-code
	}

	
	public ArrayList<Contact> loadCContacts() {
		// begin-user-code
		// TODO Auto-generated method stub
		return dataManager.load();
		// end-user-code
	}
}