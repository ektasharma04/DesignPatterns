import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * <!-- begin-UML-doc -->
 * <p>DateTimeDisplayer displayer;</p><p>ask user to choose 1- format 1, 2 - format 2;</p><p>case 1: displayer=new DateTimeDisplayerF1();break;</p><p>case 2: displayer=new DateTimeDisplayerF2();break;</p><p>displayer.doWork();</p>
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class MainApp {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML t1o Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		//public  void main()
		System.out.println("Please choose the required format \n1. Date: MM/DD/YYYY Time: HH:MM:SS \n2. Date: DD-MM-YYYY Time: SS,MM,HH");
		Scanner s = new Scanner(System.in);
		
		int choice;
		try
		{
			choice=s.nextInt();
			switch(choice)
			{
				case 1: DateTimeDisplayer dateTimeDisplayerF1 = new DateTimeDisplayerF1();
						dateTimeDisplayerF1.doWork();
					break;
				case 2:DateTimeDisplayer dateTimeDisplayerF2 = new DateTimeDisplayerF2();
						dateTimeDisplayerF2.doWork();;
					break;
					default: break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage().toString());
		}
		
		// end-user-code
	}
}