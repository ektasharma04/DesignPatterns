import java.util.Scanner;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class DateTimeDisplayer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract DateObject createDateObject();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public abstract TimeObject createTimeObject();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>loop</p><p></p><p>ask user to choose d- display date t- display q-quit loop.</p><p>case "d":DateObject dateObject  = createDateObject(); dateObject.printDate();break;</p><p>case "t":TimeObject timeObject  = createTimeObject(); timeObject.printDate(); break;</p><p>case "q": quit loop</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void doWork() 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		String choice;
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		try{
			while(flag)
			{
				System.out.println("Choose date or time d-date, t-time, or q-quit");
				choice=s.nextLine();
			
				switch(choice)
				{
					case "d" :DateObject dateObject  = createDateObject(); dateObject.printDate();
						break;
					case "t" :TimeObject timeObject  = createTimeObject(); timeObject.printTime();
						break;
					case "q":flag=false;
						break;						
					default: flag=false;
						break;
					
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// end-user-code
	}
}