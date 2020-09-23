// Welcome message
public class EmpWageBuilderWelcome{
	public static void main(String[] args){
		System.out.println("Welcome to employee wage problem");
	}
}

// Employee present or  absent
public class EmpWageBuilderUC1{
	public static void main(String[] args){
		int IS_FULL_TIME =1;
		double empCheck =Math.floor(Math.random() *10) %2;
		if(empCheck == IS_FULL_TIME){
				System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
	}
}


