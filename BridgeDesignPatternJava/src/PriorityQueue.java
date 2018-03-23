import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author esharma
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class PriorityQueue extends Queue {
	public PriorityQueue(List myList2) {
		super(myList2);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param value
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void enqueue(int value) 
	{
		// begin-user-code
		// TODO Auto-generated method stub
		//imp.add(value);
		//Collections.sort(imp);
		int n = imp.size();
		if (imp.isEmpty()) {
			imp.add(value);
		} else {
			boolean found = false;
			for (int i = 0; i < n; i++) {
				// int key = value;// (int) imp.get(i);//arr[i];
				// int j = i-1;

				/*
				 * Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current
				 * position
				 */
				if (value < (int) imp.get(i)) {
					/*
					 * for(int k=imp.size();k>=i;k--) { imp.add(k,imp.get(k-1)); imp.ad }
					 */
					imp.add(i, value);
					found = true;
					break;
				}
				/*
				 * if((int)imp.get(i) > key) { imp.add(i+1,imp.get(i)); imp.add(i,key); //j = j-1; }
				 */
				// else {
				// imp.add(i + 1, key);
				// }
			}

			if (found != true)
				imp.add(n, value);
	       // 
	       /* if(imp.isEmpty())
	        {
	        	imp.add(value);
	        }
	        else
	        {
	        	for (int i=0; i<n; i++)
		        {
		            int key = value;//(int) imp.get(i);//arr[i];
		            //int j = i-1;
		 
		            /* Move elements of arr[0..i-1], that are
		               greater than key, to one position ahead
		               of their current position */
		      /*      if(key<(int)imp.get(i))
		            {
		            	/*for(int k=imp.size();k>=i;k--)
		            	{
		            		imp.add(k,imp.get(k-1));
		            		imp.ad
		            	}*/
		            	//imp.add(i,key);break;
		            }
		            /*if((int)imp.get(i) > key)
		            {
		            	imp.add(i+1,imp.get(i));
		            	imp.add(i,key);
		                //j = j-1;
		            }*/
		        /*    while(key>(int)imp.get(i))
		            {
		            	
		            }
		            else
		            {imp.add(i+1,key);}
		        }
	        }*/
	    
		// end-user-code
	
}}