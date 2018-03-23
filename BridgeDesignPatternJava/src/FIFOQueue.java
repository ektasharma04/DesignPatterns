import java.util.List;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FIFOQueue extends Queue {
	public FIFOQueue(List myList1) {
		super(myList1);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">imp.add(value);</span></p>
	 * <!-- end-UML-doc -->
	 * @param value
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void enqueue(int value) {
		// begin-user-code
		// TODO Auto-generated method stub
		imp.add(value);
		// end-user-code
	}
}