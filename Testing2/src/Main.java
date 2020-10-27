import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	printName();
	printAge();
	printGender();
	printMarital();
	printCitizenship();
	printPhone();
	printWork();
	printLanguage();
	printGrade();
	printGpa();
	printCert();
	}
	
	public static void printName() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("name" + name);
	}
	
	public static void printAge() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		System.out.println("age" + age);
	}
	
	public static void printGender() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your gender: ");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("gender" + gender);
	}
	
	public static void printMarital() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your marital status: ");
		String marital = in.next();
		System.out.println("marital" + marital);
	}
	
	public static void printCitizenship() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your citizenship: ");
		String citizenship = in.next();
		System.out.println("citizenship" + citizenship);
	}
	
	public static void printPhone() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your phone number: ");
		String phone = in.next();
		System.out.println("phone" + phone);
	}
	
	public static void printWork() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your work experience 1: ");
		String work1 = in.next();
		System.out.print("Enter your work experience 2: ");
		String work2 = in.next();
		System.out.println("work experience" + work1);
		System.out.println("work experience" + work2);
	}
	
	public static void printLanguage() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your language 1: ");
		String language1 = in.next();
		System.out.print("Enter your language 2: ");
		String language2 = in.next();
		System.out.print("Enter your language 3: ");
		String language3 = in.next();
		System.out.println("language" + language1);
		System.out.println("language" + language2);
		System.out.println("language" + language3);
	}
	
	public static void printGrade() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Grade STIA1113: ");
		String str = in.next();
		char grade = str.charAt(1);
		System.out.println("grade" + grade);			
	}
	
	public static void printGpa() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter GPA Semester 1: ");
		double num1 = in.nextDouble();
		System.out.print("Enter GPA Semester 2: ");
		double num2 = in.nextDouble();
		
		double sum = num1+num2;
		double totalgpa = sum/2;
		System.out.println("cgpa for current semester" + totalgpa);
	}
	
	public static void printCert() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your cert 1: ");
		String cert1 = in.next();
		System.out.print("Enter your cert 2: ");
		String cert2 = in.next();
		System.out.print("Enter your cert 3: ");
		String cert3 = in.next();
		System.out.print("Enter your cert 4: ");
		String cert4 = in.next();
		System.out.println("cert" + cert1);
		System.out.println("cert" + cert2);
		System.out.println("cert" + cert3);
		System.out.println("cert" + cert4);
	}

}
