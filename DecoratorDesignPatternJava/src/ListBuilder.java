import java.util.Stack;

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
	 * <p><span style="font-size:12pt;">Algorithm 1: decorating ListComposite Node only </span></p><p><span style="font-size:12pt;">ListComponent newNode = new CloseListDecorator(new OpenListDecorator(new ListComposite()));</span></p><p><span style="font-size:12pt;">if (stack is not empty) {</span></p><p><span style="font-size:12pt;">get the listComposite from top of stack (do not remove it)</span></p><p><span style="font-size:12pt;">int size = top.numberOfChildren()</span></p><p><span style="font-size:12pt;">top.addChild(size, newNode);</span></p><p><span style="font-size:12pt;">}</span></p><p><span style="font-size:12pt;">push newNode onto stack;</span></p><p><span style="font-size:12pt;">--------------------------------------------------------------------------------------------</span></p><p><span style="font-size:12pt;">Algorithm 2: decorating first and last children of a ListComposite Node</span></p><p><span style="font-size:12pt;">ListComponent newNode = new ListComposite();</span></p><p><span style="font-size:12pt;">if (stack is not empty) {</span></p><p><span style="font-size:12pt;">get the listComposite from top of stack (do not remove it)</span></p><p><span style="font-size:12pt;">int size = top.numberOfChildren()</span></p><p><span style="font-size:12pt;">if (size==0) newNode = new OpnListDecorator(newNode);</span></p><p><span style="font-size:12pt;">top.addChild(size, newNode);</span></p><p><span style="font-size:12pt;">}</span></p><p><span style="font-size:12pt;">------------------------------------------------------------------------------------</span></p><p><span style="font-size:12pt;">Algorithm 3: decorating first and last Item nodes of a subtree </span></p><p><span style="font-size:12pt;">ListComponent newNode = new ListComposite();</span></p><p><span style="font-size:12pt;">if (stack is not empty) {</span></p><p><span style="font-size:12pt;">get the listComposite from top of stack (do not remove it)</span></p><p><span style="font-size:12pt;">int size = top.numberOfChildren()</span></p><p><span style="font-size:12pt;">top.addChild(size, newNode);</span></p><p><span style="font-size:12pt;">}</span></p><p><span style="font-size:12pt;">push newNode onto stack;</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildOpenBracket() {
		// begin-user-code
		// TODO Auto-generated method stub
		//Algorithm 1: decorating ListComposite Node only 
		ListComponent newNode = new CloseListDecorator(new OpenListDecorator(new ListComposite()));
		if (!stack.empty()) 
		{
			ListComponent root=stack.peek();
			///*get the listComposite from top of stack (do not remove it)
			int size = root.numberOfChildren();
			//System.out.println("root.nuber of children: "+size);
			root.addChild(size, newNode);
		}
		stack.push(newNode);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">Algorithm 1: decorating ListComposite Node only </span></p><p><span style="font-size:18pt;">pop stack</span></p><p><span style="font-size:18pt;">-----------------------------------------------------</span></p><p><span style="font-size:18pt;">Algorithm 2: decorating first and last children of a ListComposite Node</span></p><p><span style="font-size:18pt;">ListComponent thisNode = stack.pop();</span></p><p><span style="font-size:18pt;">int size = parentNode.numberOfChildren();</span></p><p><span style="font-size:18pt;">ListComponent lastChild = parentNode.getChild(size-1);</span></p><p><span style="font-size:18pt;">lastChild = new CloseListDecorator(lastChild);</span></p><p><span style="font-size:18pt;">parentNode.removeChild(size);</span></p><p><span style="font-size:18pt;">parentNode.addChild(size-1, lastChild);</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildCloseBracket() {
		// begin-user-code
		// TODO Auto-generated method stub
		if(stack.size()>1)
			stack.pop();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:12pt;">Algorithm 1: decorating ListComposite Node only </span></p><p><span style="font-size:12pt;">create newItem;</span></p><p><span style="font-size:12pt;">If (stack is not empty) stack.top().addChild(newItem);</span></p><p><span style="font-size:12pt;">else </span></p><p><span style="font-size:12pt;">ListComponent singleNode = new CloseListDecorator(new OpenListDecorator(newItem)));</span></p><p><span style="font-size:12pt;">stack.push(singleNode);</span></p><p><span style="font-size:12pt;">-------------------------------------------------------------------------------------------</span></p><p><span style="font-size:12pt;">Algorithm 2: decorating first and last children of a ListComposite Node</span></p><p><span style="font-size:12pt;">create newItem;</span></p><p><span style="font-size:12pt;">If (stack is not empty) stack.top().addChild(newItem);</span></p><p><span style="font-size:12pt;">else </span></p><p><span style="font-size:12pt;">ListComponent singleNode = new CloseListDecorator(new OpenListDecorator(newItem)));</span></p><p><span style="font-size:12pt;">stack.push(singleNode);</span></p><p><span style="font-size:12pt;">--------------------------------------------------------------------------------------------------</span></p><p><span style="font-size:12pt;">Algorithm 3: decorating first and last Item nodes of a subtree </span></p><p><span style="font-size:12pt;">create newItem;</span></p><p><span style="font-size:12pt;">If (stack is not empty) stack.top().addChild(newItem);</span></p><p><span style="font-size:12pt;">else </span></p><p><span style="font-size:12pt;">ListComponent singleNode = new CloseListDecorator(new OpenListDecorator(newItem)));</span></p><p><span style="font-size:12pt;">stack.push(singleNode);</span></p>
	 * <!-- end-UML-doc -->
	 * @param number
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildElement(int number) {
		// begin-user-code
		// TODO Auto-generated method stub
	/*	create newItem;
		If (stack is not empty) stack.top().addChild(newItem);
		else 
		ListComponent singleNode = new CloseListDecorator(new OpenListDecorator(newItem)));
		stack.push(singleNode);*/
		Item newItem=new Item(number);
		//ListComponent top;
		if(!stack.isEmpty())
		{
			ListComponent top=(ListComponent)stack.peek();
			int size=top.numberOfChildren();
			top.addChild(size,newItem);
			
		}
		else
		{
			ListComponent singleNode = new CloseListDecorator(new OpenListDecorator(newItem));
			stack.push(singleNode);
		}
		
	}

	public ListComponent getList() throws Exception
	{
		return stack.get(0);
		// end-user-code
	}
}