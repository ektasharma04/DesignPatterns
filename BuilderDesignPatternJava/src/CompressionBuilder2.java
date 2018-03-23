import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CompressionBuilder2 extends CompressionBuilder {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<String> compressedText=new ArrayList<>();
	private ArrayList<String> wordOnlyList=new ArrayList<>();
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Hashtable<String,ArrayList<Integer>> wordList=new Hashtable<>();
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int wordCount;

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>wordCount++;</p><p>//wordList(key, arrayList&lt;Integer&gt;)</p><p>ArrayList&lt;Integer&gt; wordPositions = wordList.get(word);</p><p>if(wordPositions==null),</p><p>{</p><p>ArrayList&lt;Integer&gt; positions =new ArrayList&lt;Integer&gt;();</p><p>positions.add(new Integer(wordCount));</p><p>wordList.add(word,positions);}</p><p>//wordList.add(word,new ArrayList&lt;Integer&gt;());  Integer position wordCount);//compressedText+=word+"";}</p><p>else</p><p>//{compressedText+="#" +wordPosition.intVale()+"";</p><p>wordPositions.add(new Integer wordCount));}</p><p></p><p></p>
	 * <!-- end-UML-doc -->
	 * @param word
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	
	public void buildWord(String word) {
		// begin-user-code
		
		wordCount++;
		//wordList(key, arrayList<Integer>)
		ArrayList<Integer> wordPositions = (ArrayList<Integer>) wordList.get(word);
		if (wordPositions == null)
		{
			ArrayList<Integer> positions = new ArrayList<Integer>();
			wordOnlyList.add(word);
			//positions.add(new Integer(wordCount));
			wordList.put(word, positions);
		}
		else 
		{
			wordPositions.add(new Integer(wordCount));
		}

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>for each word in wordList //wordList.get(i)</p><p>compressedText += word +"";</p><p>for each position in wordList.get(word)</p><p>{compressedText+=postion.intValue()+"";</p><p>compressedText.add("#);}</p><p>//compressedText+="#";</p><p>}</p><p>return compressedText;</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ArrayList<String> getResult() {
		// begin-user-code
		//String p;
		/*for each word in wordList // wordList.get(i) {
		compressedText.add(word + " ");
		for each position in wordList.get(word)
		{ compressedText.add(position.toString+ " ");}
		compressedText.add("#");
		}
		*/int wordCheck=0;
		for(String word:wordOnlyList)
		{
			//System.out.println(word+" "+wordList.get(word).toString());
			compressedText.add(word.trim()+" ");
			//compressedText.add("#");
			boolean flag=false;int i=0;int a=wordOnlyList.size();
			for(Integer position:wordList.get(word))
			{
				
				//System.out.println(position);
				if(i!=0)
				{
					compressedText.add(" "+position);
				}
				else{compressedText.add(""+position);}
				i++;
				
			}
			if(wordCheck!=a-1)
			{compressedText.add("#");}
			wordCheck++;
			
		}
		return compressedText;
		// end-user-code
	}
}