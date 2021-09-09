import java.util.Scanner;
class student
{
	String n;
	int reg_no;
void display() {
	System.out.println("Reg.no="+reg_no);
	System.out.println("Name="+n);
}
}
public class prac {

	public static void main(String[] args) {
		student s;
		s=new student();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your name:");
		s.n=s1.nextLine();
		System.out.println("Enter your Reg.no:");
		s.reg_no=s1.nextInt();
		s.display();
	}

}