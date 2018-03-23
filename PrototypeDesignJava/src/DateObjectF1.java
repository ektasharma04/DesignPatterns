/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateObjectF1 extends DateObject {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">print month + "/" + day + "/" + year</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printDate() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println(super.month+"/"+super.day+"/"+super.year);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">call superclass constructor</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DateObjectF1() {
		super();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">return new DateObjectF1();</span></p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DateObject cloneMe() {
		// begin-user-code
		// TODO Auto-generated method stub
		return new DateObjectF1();
		// end-user-code
	}
}