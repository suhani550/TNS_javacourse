package prog;

public class bloodDonationEligibility {

	public static void main(String[] args) {
		//program for checking person is elligible for blood donation or not
		
		int age=20;
		int weight=55;
		
		if(age>=18 && weight>=50){
			System.out.println("person is elligible for blood donation");
			
		}
		else {
			System.out.println("person is not elligible for blood donation");
		}

	}

}
