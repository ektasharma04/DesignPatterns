/**
 * 
 */
import java.util.ArrayList;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GoFListAdapter implements GoFList {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList arrayList;
	final int FIRST=0;
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>arrayList = new ArrayList();</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public  GoFListAdapter() {
		// begin-user-code
		// TODO Auto-generated method stub
		arrayList = new ArrayList();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see GoFList#count()
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */public int count() {
			// begin-user-code
			// TODO Auto-generated method stub
			return arrayList.size();
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#get(int index)
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public Object get(int index) {
			// begin-user-code
			// TODO Auto-generated method stub
			return arrayList.get(index);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#first()
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public Object first() {
			// begin-user-code
			// TODO Auto-generated method stub
			return arrayList.get(FIRST);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#last()
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public Object last() {
			// begin-user-code
			// TODO Auto-generated method stub
			return arrayList.get(arrayList.size()-1);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#include(Object obj)
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public boolean include(Object obj) {
			// begin-user-code
			// TODO Auto-generated method stub
			return arrayList.contains(obj);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#append(Object obj)
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public void append(Object obj) {
			// begin-user-code
			// TODO Auto-generated method stub
			arrayList.add(obj);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#prepend(Object obj)
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public void prepend(Object obj) {
			// begin-user-code
			// TODO Auto-generated method stub
			arrayList.add(FIRST,obj);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#delete(Object obj)
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public void delete(Object obj) {
			// begin-user-code
			// TODO Auto-generated method stub
			arrayList.remove(obj);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#deleteLast()
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public void deleteLast() {
			// begin-user-code
			// TODO Auto-generated method stub
			arrayList.remove(arrayList.size()-1);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#deleteFirst()
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public void deleteFirst() {
			// begin-user-code
			// TODO Auto-generated method stub
			arrayList.remove(FIRST);
			// end-user-code
		}

		/** 
		 * (non-Javadoc)
		 * @see GoFList#deleteAll()
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		public void deleteAll() {
			// begin-user-code
			// TODO Auto-generated method stub
			arrayList.clear();
			// end-user-code
		}
}