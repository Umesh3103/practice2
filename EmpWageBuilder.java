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

// Employee daily wage

public class EmpWageBuilderUC2{
	public static void main(String[] args){
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10) %2;
		if(empCheck==IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;
		empWage=empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
	}
}

// Employee full time part time wage calculation

public class EmpWageBuilderUC3{
	public static void main(String[] args){
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;	
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10) %3;
		if(empCheck==IS_FULL_TIME)
			empHrs=8;
		else if(empCheck == IS_PART_TIME)
			empHrs=4;
		empWage=empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:" +empWage);
	}
}
