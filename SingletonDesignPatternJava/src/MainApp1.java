import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
public class MainApp1 {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>CompressionBuilder builder = new CompressionBuilder1();</p><p>CompressionDirector director= new CompressionDirector(builder);</p><p>ask user to give file name;</p><p>director.compressText(fileName);</p><p >String ctext=(CompressionBuilder1) builder.getResult();</p><p>Open output file with file name fileName.Z1;</p><p>write ctext to the file;</p><p>close the file.</p>
	 * <!-- end-UML-doc -->
	 * @throws IOException 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String args[]) throws IOException 
	{
		new CompressionBuilder1();
		// new CompressionBuilder2();
		Env.compressionType = "CompressionBuilder1";
		CompressionBuilder builder = CompressionBuilder.getInstance();
		//CompressionBuilder builder = new CompressionBuilder1();
		CompressionDirector director= new CompressionDirector(builder);
		Scanner s =new Scanner(System.in);
		System.out.println("Please enter file name");
		String fileName= s.nextLine();
		//ask user to give file name;
		//System.out.println(new File(",").getAbsoluteFile());
		director.compressText(fileName);
		String ctext=((CompressionBuilder1) builder).getResult();
		
		FileWriter f=new FileWriter(fileName+".Z1");
		//Scanner a =new Scanner(f);
		f.write(ctext);
		f.flush();
		f.close();
		//System.out.println(ctext);
		System.out.println("Output generated");
	}
}