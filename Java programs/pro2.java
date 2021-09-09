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
		s.n="Rama";
		s.reg_no=106;
		s.display();
		s=new student();
		s.n="jaya";
		s.reg_no=120;
		s.display();
	}

}