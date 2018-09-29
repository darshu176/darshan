package darshan;

public class ifnested {
	public static void main(String args[]) {
		int maths=20, science=10;
			if(maths>=18) {
				System.out.println("pass in maths");
				if(science>=18) {
					System.out.print("pass");
				}else {
					System.out.println("fail in science");
				} }else
				{
				 System.out.println("fail in maths");
				}
			}
	}

