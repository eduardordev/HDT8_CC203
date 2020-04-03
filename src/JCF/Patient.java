/*
*Eduardo Ramírez Herrera
*19946
*HDT8 Algoritmos y estructuras de datos
*/
public class Patient{
	
	private String name;
	private String symptom;
	private String priorCode;
	
	public Patient(String na, String sy, String pr){
		name = na;
		symptom = sy;
		priorCode = pr;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getSymptom(){
		return this.symptom;
	}
	
	public String getPriorCode(){
		return this.priorCode;
	}
	
}