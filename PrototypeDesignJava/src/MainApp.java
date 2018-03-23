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
public class MainApp 
{
	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:10pt;">DateTimeDispalyer displayer = new DateTimeDisplayer();</span></p><p><span style="font-size:10pt;">DateObject dateObjectF1 = new DateObjectF1();</span></p><p><span style="font-size:10pt;">DateObject dateObjectF2 = new DateObjectF2();</span></p><p><span style="font-size:10pt;">TimeObject timeObjectF1 = new TimeObjectF1();</span></p><p><span style="font-size:10pt;">TimeObject timeObjectF2 = new TimeObjectF2();</span></p><p><span style="font-size:10pt;">displayer.setDatePrototype(dateObjectF1);</span></p><p><span style="font-size:10pt;">displayer.setTimePrototypr(timeObjectF1);</span></p><p><span style="font-size:10pt;">loop</span></p><p><span style="font-size:10pt;">ask user to enter</span></p><p><span style="font-size:10pt;">"d": displayer.displayDate(); break;</span></p><p><span style="font-size:10pt;">"t": displayer.displayTime(); break;</span></p><p><span style="font-size:10pt;">"fd1": displayer.setDatePrototype(dateObjectF1); break;</span></p><p><span style="font-size:10pt;">"ft1": displayer.setTimePrototype(timeObejctF1); break;</span></p><p><span style="font-size:10pt;">"fd2": displayer.setDatePrototype(dateObjectF2); break;</span></p><p><span style="font-size:10pt;">"ft2": displayer.setTimePrototype(timeObjectF2); break;</span></p><p><span style="font-size:10pt;">"q": exit loop;</span></p><p><span style="font-size:10pt;">endLoop</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		DateTimeDisplayer displayer = new DateTimeDisplayer();
		DateObject dateObjectF1 = new DateObjectF1();
		DateObject dateObjectF2 = new DateObjectF2();
		TimeObject timeObjectF1 = new TimeObjectF1();
		TimeObject timeObjectF2 = new TimeObjectF2();
		displayer.setDatePrototype(dateObjectF1);
		displayer.setTimePrototype(timeObjectF1);
		Scanner s= new Scanner(System.in);
		String choice;
		while(true)
		{
			System.out.println("Choosed a date or time format");			
			
			choice=s.nextLine();
			switch(choice)
			{					
				case "d": displayer.displayDate(); break;
				case "t": displayer.displayTime(); break;
				case "fd1": displayer.setDatePrototype(dateObjectF1); break;
				case "ft1": displayer.setTimePrototype(timeObjectF1); break;
				case "fd2": displayer.setDatePrototype(dateObjectF2); break;
				case "ft2": displayer.setTimePrototype(timeObjectF2); break;
				case "q":System.exit(0);
			
			}
		}
		
		
		
		// end-user-code
	}
}