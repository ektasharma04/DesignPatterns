import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class DateObject {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected int year;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected int month;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected int day;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void printDate();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">get system date</span></p><p><span style="font-size:18pt;">set values for year, month, day from system date</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DateObject() {
		// begin-user-code
		Date date =new Date();
		DateFormat mon = new SimpleDateFormat("MM");
		//Date date = new Date();
		month=Integer.parseInt(mon.format(date));
		DateFormat dy = new SimpleDateFormat("dd");
		//Date date = new Date();
		day=Integer.parseInt(dy.format(date));
		DateFormat yr = new SimpleDateFormat("yyyy");
		//Date date = new Date();
		year=Integer.parseInt(yr.format(date));
		// end-user-code
	}
}