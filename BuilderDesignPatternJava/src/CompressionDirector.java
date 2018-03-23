import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
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
public class CompressionDirector {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CompressionBuilder compressionBuilder;

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>open file;</p><p>for each word in the opened file.</p><p>compressionBuilder.buildWord(word);</p><p>close opened file</p>
	 * <!-- end-UML-doc -->
	 * @param fileName
	 * @throws FileNotFoundException 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void compressText(String fileName) throws FileNotFoundException 
	{
		
		ArrayList<String> arr=new ArrayList<String>();
		File f=new File(fileName+".txt");
		 Scanner in = new Scanner(f);
		 while(in.hasNextLine())
		 {
		    String currentLine = in.nextLine();
		    String[] lineAsWords = currentLine.split(" ");
		    List<String> words = Arrays.asList(lineAsWords);
		    arr.addAll(words);
		 }
		 for(String word:arr)
		 {
			 //System.out.println(wor);
			 compressionBuilder.buildWord(word);	 
		 }
		 in.close();
		//
		// end-user-code
		//in.u
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>this.compressionBuilder=builder;</p>
	 * <!-- end-UML-doc -->
	 * @param builder
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CompressionDirector(CompressionBuilder builder) {
		// begin-user-code
		this.compressionBuilder = builder;
		// end-user-code
	}
}