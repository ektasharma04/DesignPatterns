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
public abstract class ListDecorator extends ListComponent {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//private ArrayList<ListComponent> listComponent=new ArrayList();
	ListComponent listComponent;
	public ListDecorator(ListComponent listComponent) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		this.listComponent=listComponent;
		// end-user-code
	}

	public void printValue() {
		// begin-user-code
		// TODO Auto-generated method stub
		
		  listComponent.printValue();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">listComponent.addChild()[</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addChild(int index, ListComponent listComponent) {
		// begin-user-code
		// TODO Auto-generated method stub
		this.listComponent.addChild(index, listComponent);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ListComponent getChild(int index) {
		// begin-user-code
		// TODO Auto-generated method stub
		return super.getChild(index);
		// end-user-code
	}
	 public void removeChild(int index) {
	        super.removeChild(index); 
	    }

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int numberOfChildren(ArrayList<ListComponent> listComponent) {
		 
		// begin-user-code
		// TODO Auto-generated method stub
		return this.listComponent.numberOfChildren();
		// end-user-code
	}
		
}