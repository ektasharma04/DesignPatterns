import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DateObjectF1 extends DateObject {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>print month+ "/"+day+"/" year</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//Date d;
	//int day, year, month;
	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:24pt;">call super class constructor</span></p><p></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public DateObjectF1() 
	{
		// begin-user-code
		super();
		/*day=super.day;
		year=super.year;
		month=super.month;*/
		// end-user-code
	}
	public void printDate() 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		
		//DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//Date date = new Date();
		//super.day;
		System.out.println(super.month+"/"+super.day+"/"+super.year);
				
		// end-user-code
	}

	
	
}