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
	 * <p><span style="font-size:18pt;">DateObject dateObject = dateTimeFactory.createDateObject();</span></p><p><span style="font-size:18pt;">dateObject.printDate();</span></p>
	 * <!-- end-UML-doc -->
	 * @param dateTimeFactory
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void displayDate(DateTimeFactory dateTimeFactory) 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		DateObject dateObject = dateTimeFactory.createDateObject();
		dateObject.printDate();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param dateTimeFactory
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void displayTime(DateTimeFactory dateTimeFactory) 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		TimeObject timeObject = dateTimeFactory.createTimeObject();
		timeObject.printTime();
		// end-user-code
	}
}