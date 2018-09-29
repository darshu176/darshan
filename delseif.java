package darshan;
import java.util.Scanner;


public class delseif {
	public static void main (String args[]) {
		Scanner input= new Scanner(System.in);
		int age;
		System.out.print("please enter age:");
		age=input.nextInt();
		if(age<18) {
			System.out.println("you are too young to vote");	
		}else if (age>=18&&age<=40) {
			System.out.println("you are an adult");
		}else if (age>40&&age<=60) {
			System.out.println("you are old");
		}else if (age>60) {
			System.out.println("sleep at home!!");
		}
		
	}

}
