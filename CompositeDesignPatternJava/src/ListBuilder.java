import java.util.Stack;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListBuilder {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ListComponent root;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Stack<ListComponent> stack=new Stack();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">create a new ListComposite object/node;</span></p><p><span style="font-size:18pt;">if (stack is not empty) {</span></p><p><span style="font-size:18pt;">get the listComposite from top of stack (do not remove it)</span></p><p><span style="font-size:18pt;">int size = top.numberOfChildren()</span></p><p><span style="font-size:18pt;">top.addChild(size, newListComposite);</span></p><p><span style="font-size:18pt;">}</span></p><p><span style="font-size:18pt;">push newListComposite onto stack;</span></p><p><span style="font-size:18pt;"></span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	/*create a new ListComposite object/node;
if (stack is not empty) {
get the listComposite from top of stack (do not remove it)
int size = top.numberOfChildren()
top.addChild(size, newListComposite);
}
push newListComposite onto stack;*/
	public void buildOpenBracket() {
		// begin-user-code
		// TODO Auto-generated method stub
		//create a new ListComposite object/node;
		ListComponent root=new ListComponent();
		ListComposite newListComposite=new ListComposite();
		
		if(!stack.empty()) 
		{
			root=stack.peek();
			///*get the listComposite from top of stack (do not remove it)
			int size = root.numberOfChildren();
			root.addChild(size, newListComposite);
			//System.out.println(stack.size()+"stack size 1");
		}
		stack.push(newListComposite);
		//System.out.println(stack.size()+"stack size");
		//push newListComposite onto stack;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">pop stack</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildCloseBracket() {
		// begin-user-code
		// TODO Auto-generated method stub\
		if(stack.size()>1)
		stack.pop();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">create newItem;</span></p><p><span style="font-size:18pt;">top.addChild(newItem);</span></p>
	 * <!-- end-UML-doc -->
	 * @param number
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildElement(int number) {
		// begin-user-code
		// TODO Auto-generated method stub
		//System.out.println("be");
		Item newItem=new Item(number);
		ListComponent top;

		top=stack.peek();
		int size=top.numberOfChildren();
		//int size=stack.peek();
		//ListComponent newListComposite = null;
		top.addChild(size,newItem);//root=top;
		// end-user-code
		
	}

	public ListComponent getList() {
		// TODO Auto-generated method stub
		//System.out.println(stack.size()+"stack size 3");
		ListComponent root=new ListComponent();
		root=stack.peek();
		return root;
	}
}