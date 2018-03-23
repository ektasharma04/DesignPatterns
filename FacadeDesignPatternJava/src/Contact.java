import java.io.Serializable;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Contact implements Serializable  {
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String phone;
	
	private String email;
	@Override
	public String toString()
	{
		return "First Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nPhone: "+phone+"\nEmail: "+email;	}
	public String getFirstName()
	{
		return firstName;
		
	}
	public String getLastName()
	{
		return lastName;}
	public String getAddress()
	{
		return address;}
	public String getPhone()
	{
		return phone;}
	public String getEmail()
	{
		return email;}
	public void setFirstName(String input)
	{
		firstName=input;
	}
	public void setLastName(String input)
	{
		lastName=input;
	}
	public void setAddress(String input)
	{
		address=input;
	}
	public void setPhone(String input)
	{
		phone=input;
	}
	public void setEmail(String input)
	{
		email=input;
	}
	
	
}