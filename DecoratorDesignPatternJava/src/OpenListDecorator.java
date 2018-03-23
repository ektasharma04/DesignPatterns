import java.util.ArrayList;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class OpenListDecorator extends ListDecorator {
	public OpenListDecorator(ListComponent decoratee) {
		super(decoratee);
		// TODO Auto-generated constructor stub
	}

	
	public void printValue() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("(");
		super.printValue();
		// end-user-code
	}
	 
	    
}