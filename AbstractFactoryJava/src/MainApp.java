import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class MainApp {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">DateTimeDispalyer displayer = new DateTimeDisplayer();</span></p><p><span style="font-size:18pt;">DateTimeFactory factory = new DateTimeFactoryF1();</span></p><p><span style="font-size:18pt;">loop</span></p><p><span style="font-size:18pt;">ask user to enter</span></p><p><span style="font-size:18pt;">"d": displayer.displayDate(factory); break;</span></p><p><span style="font-size:18pt;">"t": displayer.displayTime(factory); break;</span></p><p><span style="font-size:18pt;">"f1": factory = new DateTimeFactoryF1(); break;</span></p><p><span style="font-size:18pt;">"f2": factory = new DateTimeFactoryF2(); break;</span></p><p><span style="font-size:18pt;">"q": exit loop;</span></p><p><span style="font-size:18pt;">endLoop</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		DateTimeDisplayer displayer = new DateTimeDisplayer();
		DateTimeFactory factory = new DateTimeFactoryF1();
		/*DateObject dateObjectF1 = new DateObjectF1();
		DateObject dateObjectF2 = new DateObjectF2();
		TimeObject timeObjectF1 = new TimeObjectF1();
		TimeObject timeObjectF2 = new TimeObjectF2();
		displayer.setDatePrototype(dateObjectF1);
		displayer.setTimePrototype(timeObjectF1);*/
		Scanner s= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Choosed a date or time format");
			String choice;
			
			choice=s.nextLine();
			switch(choice)
			{
			
			
				case "d": displayer.displayDate(factory); break;
				case "t": displayer.displayTime(factory); break;
				case "f1": factory = new DateTimeFactoryF1(); break;
				case "f2": factory = new DateTimeFactoryF2(); break;
				case "q": System.exit(0);;
				
			
			}
		}
	}
}