package language.basics;

public class RunTimeExceptionHandling {

	public static void main(String[] args) {
		int [] empIds = new int [3];
		
		try { // plan A
		empIds[0] = 10;
		empIds[1] = 20;
		empIds[2] = 30;		
		empIds[3] = 40;
		}catch(Exception sky) { //plan B
			sky.printStackTrace();
			empIds[0] = 1;
			empIds[1] = 2;
			empIds[2] = 3;
			empIds[3] = 5;
			
		}finally { // always it will execute
		
		System.out.println("Execution Completed");
	}

	}
}
