/**
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DataManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	File f;
	ArrayList<Contact> contactList;
	public DataManager()
	{
		contactList=new ArrayList<Contact>();
		f = new File("Contacts.txt");
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<Contact> load() {
		// begin-user-code
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fi = new FileInputStream(f);
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			/*Person pr1 = (Person) oi.readObject();
			Person pr2 = (Person) oi.readObject();*/
		
			while(fi.available()!=0)
			{
				Contact c1=(Contact)oi.readObject();
				contactList.add(c1);
			}
			

		/*	System.out.println(pr1.toString());
			System.out.println(pr2.toString());*/

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactList;

	}



		// end-user-code
	

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void save(Contact c, Boolean overwrite) {
		// begin-user-code
		// TODO Auto-generated method stub
		try {
			FileOutputStream file = new FileOutputStream(f, overwrite);
			ObjectOutputStream o = new ObjectOutputStream(file);

			// Write objects to file
			o.writeObject(c);
			//o.writeObject(p2);*/

			o.close();
			file.close();


		} catch (FileNotFoundException e) {
			System.out.println("File not found");e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error initializing stream");e.printStackTrace();}
		
		// end-user-code
	}
	public void save(Contact c) {
		// begin-user-code
		// TODO Auto-generated method stub
		try {
			
		
			    // do something
			
			FileOutputStream file = new FileOutputStream(f);
			ObjectOutputStream o = new ObjectOutputStream(file);

			// Write objects to file
			o.writeObject(c);
			//o.writeObject(p2);*/

			o.close();
			file.close();


		} catch (FileNotFoundException e) {
			System.out.println("File not found");e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error initializing stream");e.printStackTrace();}
		
		// end-user-code
	}
}