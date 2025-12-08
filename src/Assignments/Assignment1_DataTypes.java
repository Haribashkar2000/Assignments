package Assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		
		 //Test data
		 String [] Names = {"john.doe@example.com", "Software Engineer","Blue","To Kill a Mockingbird","2:30 PM","United States","Brown","New York City"}; 
		 float[] Values = {37.7749f, -122.4194f, 1000.50f, 25.5f,200.5f,7.5f};
		 boolean[] Status = {true, false};
		 short [] Data = {2023,500};
		 int [] Number = {1234567890,1000000};
		 char BloodType = 'A';
		 
		//1. Temperature of a city in degrees Celsius: 25.5
		 System.out.println("Temperature of a city in degrees Celsius: "+ Values[3] );
		 
		//2. Whether a customer has placed an order: true
		 System.out.println("Whether a customer has placed an order: "+ Status[0]);
		 
		//3. Person's phone number: "123-456-7890"
		 System.out.println("Person's phone number: "+ Number[0]);
		 
		//4. Amount of money in a customer's bank account: 1000.50
		 System.out.println("Amount of money in a customer's bank account: "+ Values[2]);
		 
		//5. Person's email address: "john.doe@example.com"
		 System.out.println("Person's email address: "+ Names[0]);
		 
		//6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		 System.out.println("Coordinates of a location (latitude, longitude): "+ Values[0]+","+ Values[1]);
		 
		//7. Person's marital status: true or false
		 System.out.println("Person's marital status:"+ Status[0] +" or "+ Status[1]);
		 
		//8. Person's occupation: "Software Engineer"
		 System.out.println("Person's occupation: "+ Names[1]);
		 
		//9. Person's Favorite color: "Blue"
		 System.out.println("Person's favourite colour: "+ Names[2]);
		
		//10. Current year: 2023
		System.out.println("Current year: "+ Data[0]);
		
		//11. Number of followers on a social media platform: 1,000,000
		System.out.println("Number of followers on a social media platform: "+ Number[1]);
		
		//12. Rating of a movie: 7.5
		System.out.println("Rating of a movie: "+ Values[5]);
		
		//13. Person's blood type: 'A'
		System.out.println("Person's blood type: "+ BloodType);

		//14. Title of a book: "To Kill a Mockingbird"
		System.out.println("Title of a book: "+ Names[3]);
		
		//15. Number of employees in a company: 500
		System.out.println("Number of employees in a company: "+ Data[1]);
		
		//16. Time of an event: 2:30 PM
		System.out.println("Time of an event: "+Names[4] );
		
		//17. Name of a country: "United States"
		System.out.println("Name of a country: "+Names[5]);
		
		//18. Person's eye color: "Brown"
		System.out.println("Person's eye color: "+ Names[6]);
		
		//19. Person's birthplace: "New York City"
		System.out.println("Person's birthplace: "+ Names[7]);
		
		//20. Distance between two cities: 200.5
		System.out.println("Distance between two cities: "+ Values[4]);
		
	}

}
