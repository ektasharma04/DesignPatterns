import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
public class MainApp2 {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p >CompressionBuilder builder = new CompressionBuilder1();</p><p >CompressionDirector director= new CompressionDirector(builder);</p><p >ask user to give file name;</p><p >director.compressText(fileName);</p><p >ArrayList&lt;String&gt; ctext=(CompressionBuilder1) builder.getResult();</p><p >Open output file with file name fileName.Z2;</p><p >for each word in ctext write word to the file;</p><p >close the file.</p>
	 * <!-- end-UML-doc -->
	 * @throws IOException 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) throws IOException 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		CompressionBuilder builder = new CompressionBuilder2();
		CompressionDirector director= new CompressionDirector(builder);
		Scanner s =new Scanner(System.in);
		System.out.println("Please enter file name");
		String fileName= s.nextLine();
		
		director.compressText(fileName);
		ArrayList<String> getResult=((CompressionBuilder2) builder).getResult();
		FileWriter f=new FileWriter(fileName+".Z2");
		//Scanner a =new Scanner(f);*/
		for(String word:getResult)
		{
			f.write(word);
		}
		f.flush();
		f.close();
		//System.out.println(getResult);
		System.out.println("Output generated");
		// end-user-code
	}
}