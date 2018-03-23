/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateTimeDisplayer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DateObject datePrototype;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TimeObject timePrototype;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	public void displayDate() {
		// begin-user-code
		// TODO Auto-generated method stub
		DateObject dateObject = datePrototype.cloneMe();
		dateObject.printDate();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void displayTime() {
		// begin-user-code
		// TODO Auto-generated method stub
		TimeObject timeObject = timePrototype.cloneMe();
		timeObject.printTime();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">this.datePrototype = dateObject;</span></p>
	 * <!-- end-UML-doc -->
	 * @param dateObject
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDatePrototype(DateObject dateObject) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.datePrototype = dateObject;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param timeObject
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTimePrototype(TimeObject timeObject) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.timePrototype = timeObject;
		// end-user-code
	}
}