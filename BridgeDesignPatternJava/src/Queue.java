import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Queue {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected List imp;

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">return imp.get(0);</span></p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int head() {
		// begin-user-code
		// TODO Auto-generated method stub
		return (int) imp.get(0);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param value
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract void enqueue(int value);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">imp.remove(0);</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void dequeue() {
		// begin-user-code
		// TODO Auto-generated method stub
		imp.remove(0);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>imp.isEmpty();</p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean isEmpty() {
		return imp.isEmpty();
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>this.imp = givenImp;</p>
	 * <!-- end-UML-doc -->
	 * @param givenImp
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Queue() {
		// begin-user-code
		
		// end-user-code
	}
	public Queue(List givenImp) {
		// begin-user-code
		this.imp = givenImp;
		// end-user-code
	}
	
}