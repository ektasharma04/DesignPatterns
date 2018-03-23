import java.util.HashMap;
import java.util.Hashtable;
//import CS6075SingletonBuilderJava.src.Env.java;
/** 
 * <!-- begin-UML-doc -->
 * <p>empty code</p>
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CompressionBuilder {
	
	private CompressionDirector compressionDirector;
	
	private static CompressionBuilder singleInstance;
	
	private static Hashtable<String,CompressionBuilder> registrationList=new Hashtable<>();

	
	public void buildWord(String word) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	
	protected CompressionBuilder() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	
	public static CompressionBuilder getInstance() {
		// begin-user-code
		if (singleInstance == null)
		{String key = Env.compressionType;
		singleInstance = registrationList.get(key);
		if(singleInstance == null) { singleInstance = new CompressionBuilder();}
		}
		return singleInstance;
		// end-user-code
	}

	
	protected static void register(String key, CompressionBuilder instance) {
		// begin-user-code
		// TODO Auto-generated method stub
		registrationList.put(key, instance);
		// end-user-code
	}
}