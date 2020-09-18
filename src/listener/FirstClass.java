package listener;

import listener.SecoundClass.CheckListener;

public class FirstClass {

	public  SecoundClass secoundClass;
	
	public FirstClass(){
		 secoundClass = new SecoundClass();
		 secoundClass.setListener(new CheckListener() {
			
			@Override
			public void checkInput() {
				System.out.println(" hello listener ");
				
			}
		});
	}
	
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		firstClass.secoundClass.check();
		firstClass.secoundClass.check();
				
	}

}
