package Assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
	
		// 1.  Create a 3D array 
		String [][][] Semesters ={ 
				                  {//Semester 1 //0
				                   {"Mathematics1"," Physics ", "Chemistry"," Computer Programming","Engineering Drawing"," Basic Electrical Eng."}, //0 //Subject
				                   {"Pass( 78 ) "," Pass( 85 ) ","Fail(2 1 )", "Pass( 74 )","Pass( 88 )","Pass(79)"},//1  // Marks
		                          },
				                  
				                  {//Semester 2 //1
		                        	{"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"}, //0 //Subject
		                        	{"Pass( 82 )","Pass( 77 )"," Pass( 93 )"," Fail(19 )"," Fail(24 )","Pass( 90 )"},//1 //Marks
				                  },
				                  
				                  {//Semester 3 //2
				                    {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems"," Signals and Systems","Object - Oriented Prog"}, //0 //Subject
				                    {" Pass( 88 )","Pass( 81 )","Pass( 76 )","Fail(32 )","Pass( 85 )","Pass( 78 )"}//1 //Marks
				                  },
				                  
				                  {//Semester 4 //3
				                	{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Communication Eng.","Software Engineering"},//0 //Subject
				                    {"Pass( 91 )"," Pass( 73 )","Fail(19)"," Pass( 80 )"," Pass( 76 )","Pass( 87 )"}//1 //Marks
				                  },
				                  
				                  {//Semester 5 //4
				                	  {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},//0 //Subject
				                	  {" Pass( 86 )"," Pass( 88 )"," Pass( 84)"," Pass( 95)"," Pass( 73)"," Pass( 90)"}//1 //Marks
				                  }
		};
		
		// 2. Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("In the second semester, Subject 4 and Subject 5 are "+  Semesters[1][0][3]+" and "+ Semesters[1][0][4]);
		
		// 3. Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("In the fourth semester, the marks obtained are: "+ Semesters[3][0][2]+ " - " +Semesters[3][1][2]+" and " +Semesters[3][0][5]+ " - " +Semesters[3][1][5]);
	}

}
