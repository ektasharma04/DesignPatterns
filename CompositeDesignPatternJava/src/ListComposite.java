/**
 * 
 */

import java.util.ArrayList; 
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListComposite extends ListComponent {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<ListComponent> childrenList=new ArrayList();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">print "(";</span></p><p><span style="font-size:18pt;">for each child in children list in reverse order</span></p><p><span style="font-size:18pt;">child.printValue</span></p><p><span style="font-size:18pt;">end of for</span></p><p><span style="font-size:18pt;">print ")"</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printValue() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("(");
		
		Object[] arr=childrenList.toArray();
		int size=arr.length;
		for(int i=size-1;i>=0;i--)
		{
			childrenList.get(i).printValue();;
		}
			
		//each child in children list in reverse order
		
		System.out.print(")");
		
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param index
	 * @param child
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addChild(int index, ListComponent child) {
		// begin-user-code
		// TODO Auto-generated method stub
		childrenList.add(index,child);
		
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param index
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void removeChild(int index) {
		// begin-user-code
		// TODO Auto-generated method stub
		childrenList.remove(index);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param index
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ListComponent getChild(int index) {
		// begin-user-code
		// TODO Auto-generated method stub
		Object[] lc=childrenList.toArray();
		return (ListComponent) lc[index];
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int numberOfChildren() {
		return childrenList.size();
	}
}