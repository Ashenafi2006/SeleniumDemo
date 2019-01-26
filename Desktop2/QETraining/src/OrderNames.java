import java.util.Scanner;

public class OrderNames {
	
	public static void main(String[]args){
		
		int Num;
		String Copy;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Stu: ");
		Num = s.nextInt();
		String stu[] = new String[Num];
		System.out.println("Enter Name of Stu:");
		
		for (int i = 0; i < Num; i++){
			stu[i] = s.next();
			
		}
		
		for (int i = 0; i < Num; i++){
			for (int j = 1; j < Num; j++){
				if (stu[j-1].compareTo(stu[j])>0){
				
				Copy = stu[j-1];
				stu[j-1] = stu[j];
				stu[j] = Copy;
				
			}
		}
		
	}
System.out.println(" Ordered Names are:");
   for (int i = 0; i < Num; i++){
	   System.out.println(stu[i]+" ");
   }
     
	}
	}

// Order scores by des orders 24,25,26

//String stu [] = new String [10];

/*
* String stu[]= { "Ashu","Eshe","Yeti","Taye","Bele",
* "Azema","Tizeta","Tizeta","Haile","Alemu","Berki"};
*/

/*
* for (int i = 0; i < stu.length; i++){ System.out.println(stu[i]);
* 
* 
* }
*/

//create a new copy of the arrays stu
//it has to be the same size
//i have to create another variable to be equal with the
//the first copy
/*
* System.out.println(stu[5]); System.out.println(stu[7]);
* System.out.println(stu[9]);
*/

//String stu[]= { "Ashu","Eshe","Yeti","Taye","Bele",
//"Azema","Tizeta","Tizeta","Haile","Alemu","Berki"};
