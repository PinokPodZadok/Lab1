import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LB3 {

	public static void main(String[] args) {

		// create array list object
		   ArrayList<String> arrlst = new ArrayList();
		      
		   // populate the list
		   arrlst.add("3");
		   arrlst.add("-2");
		   arrlst.add("1");
		   arrlst.add("7");
		   arrlst.add("4");

		   System.out.println("The initial list is :"+arrlst);
		      
		  
		// reverse the list
		   //Collections.sort(set, Collections.reverseOrder());
		   //Collection s.sort (list);
		   Collections.reverse(arrlst);
		      
		   System.out.println("The Reverse List is :"+arrlst);
		   }
		}
		
		
	


        //Collections.sort(set, Collections.reverseOrder());
