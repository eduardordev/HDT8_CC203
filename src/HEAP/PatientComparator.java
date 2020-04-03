import java.util.*;
/*
*Eduardo Ramírez Herrera
*19946
*HDT8 Algoritmos y estructuras de datos
*/

public class PatientComparator implements Comparator<Patient>{
	public int compare(Patient pat1, Patient pat2){
	
		if(pat1.getPriorCode().equalsIgnoreCase("A") && pat2.getPriorCode().equalsIgnoreCase("B")){
			return -1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("A") && pat2.getPriorCode().equalsIgnoreCase("C")){
			return -1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("A") && pat2.getPriorCode().equalsIgnoreCase("D")){
			return -1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("A") && pat2.getPriorCode().equalsIgnoreCase("E")){
			return -1;
		}
		
	
		else if(pat1.getPriorCode().equalsIgnoreCase("B") && pat2.getPriorCode().equalsIgnoreCase("A")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("B") && pat2.getPriorCode().equalsIgnoreCase("C")){
			return -1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("B") && pat2.getPriorCode().equalsIgnoreCase("D")){
			return -1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("B") && pat2.getPriorCode().equalsIgnoreCase("E")){
			return -1;
		}
		
		
		else if(pat1.getPriorCode().equalsIgnoreCase("C") && pat2.getPriorCode().equalsIgnoreCase("A")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("C") && pat2.getPriorCode().equalsIgnoreCase("B")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("C") && pat2.getPriorCode().equalsIgnoreCase("D")){
			return -1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("C") && pat2.getPriorCode().equalsIgnoreCase("E")){
			return -1;
		}
		

		else if(pat1.getPriorCode().equalsIgnoreCase("D") && pat2.getPriorCode().equalsIgnoreCase("A")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("D") && pat2.getPriorCode().equalsIgnoreCase("B")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("D") && pat2.getPriorCode().equalsIgnoreCase("C")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("D") && pat2.getPriorCode().equalsIgnoreCase("E")){
			return -1;
		}
		
		
		else if(pat1.getPriorCode().equalsIgnoreCase("E") && pat2.getPriorCode().equalsIgnoreCase("A")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("E") && pat2.getPriorCode().equalsIgnoreCase("B")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("E") && pat2.getPriorCode().equalsIgnoreCase("C")){
			return 1;
		}
		else if(pat1.getPriorCode().equalsIgnoreCase("E") && pat2.getPriorCode().equalsIgnoreCase("D")){
			return 1;
		}
		
		return 0;
		
	}
}