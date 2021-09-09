class student
{
	String n;
	int reg_no;
	
}
public class prac {

	public static void main(String[] args) {
		student s;
		s=new student();
		s.n="Rama";
		s.reg_no=106;
		System.out.println("Reg.no="+s.reg_no);
		System.out.println("Name="+s.n);
		s=new student();
		s.n="jaya";
		s.reg_no=120;
		System.out.println("Reg.no="+s.reg_no);
		System.out.println("Name="+s.n);
	}

}
