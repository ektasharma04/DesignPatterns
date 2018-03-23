/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <p><span style="font-size:18pt;">print value;</span></p>
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Item extends ListComponent {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int value;

	public Item(int number) {
		// TODO Auto-generated constructor stub
		value=number;
		//System.out.println("print from item"+ value);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">print value;</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printValue() {
		// begin-user-code
		// TODO Auto-generated method stub
		//System.out.println("print from item"+ value);
		System.out.print(value);
		// end-user-code
	}
}