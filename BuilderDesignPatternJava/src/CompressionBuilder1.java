import java.util.ArrayList;
import java.util.Hashtable;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CompressionBuilder1 extends CompressionBuilder {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String compressedText="";
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Hashtable<String, Integer> wordList=new Hashtable<>();;
	//private ArrayList<String> wordOnlyList=new ArrayList<String>();
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static int wordCount = 0;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>wordCount++;</p><p>Integer wordPosition = wordList.get(word);</p><p>if(wordPosition==null), </p><blockquote><p>{wordList.add(word,new Integer wordCount);compressedText+=word+"";}</p><p>else</p><p>{compressedText+="#" +wordPosition.intVale()+"";</p></blockquote><p></p>
	 * <!-- end-UML-doc -->
	 * @param word
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildWord(String word){
		// begin-user-code
		// TODO Auto-generated method stub
		wordCount++;
		
		//wordList.put(key, value)
		Integer wordPosition=(Integer) wordList.get(word);

		//System.out.println(word+" "+wordPosition+" "+wordCount+" "+wordList.get(word));
		if (wordPosition== null)
		{
			wordList.put(word, new Integer(wordCount)); 
			//wordOnlyList.add(word);
			compressedText += word+" ";
		}
		else 
		{
			//wordPosition= (Integer) wordList.get(word);
			compressedText += "#" + wordPosition.intValue() + " ";
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getResult() {
		// begin-user-code
		// TODO Auto-generated method stub
		return compressedText;
		// end-user-code
	}
}