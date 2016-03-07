
public class Farm {
	int cow = 1;
	int corn = 3;
	int milk = 0;
	int bread = 0;
	int cake =0;
	int cash = 100;
	
	void lagKorn(){
		corn += 2;
		System.out.println("Du har nå " + corn + " Korn");
	}
	
	void selgKorn(){
		
		if(corn >2){
		corn -= 3;
		cash += 20;
		System.out.println("Du har nå " + corn + " Korn");
		}
		else{
			System.out.println("Du har ikke nok korn til å selge");
		}
   }
	
	void lagMelk(){
		
		milk += 1;
		System.out.println("Du har nå " + milk + " Melk ");
		
	}
	 
	void selgMelk(){
		
		if(milk >0){
	
			milk -= 1;
			cash += 25;
			System.out.println(" Du har nå " + milk + " melk");
		}
		else{
			
			System.out.println( " Du har ikke nok melk til å selge");
		}	
	}

}
