class student
{
	static String Sname ="Hope Foundation";
	String name;
	String clas;
	int mark;
	String grade;
	double percentage;
	public student()
		{
			System.out.println("Student details");
		}
}

class task6
{
	public static void main(String[] args)
	{
	student s1=new student();
	s1.name="Naveen";
	s1.clas="10 th STD";
	s1.mark=316;
	s1.grade="B+";
	s1.percentage=65.0;
	printdetails(s1);
	
	student s2=new student();
	s2.name="Mahesh";
	s2.clas="10 th STD";
	s2.mark=317;
	s2.grade="B+";
	s2.percentage=65.5;
	printdetails(s2);
	
	student s3=new student();
	s3.name="Santhosh";
	s3.clas="10 th STD";
	s3.mark=216;
	s3.grade="C";
	s3.percentage=45.0;
	printdetails(s3);
	}
	
	public static void printdetails(student s)
		{
			System.out.println(student.Sname);
			System.out.println(s.name);
			System.out.println(s.clas);
			System.out.println(s.mark);
			System.out.println(s.grade);
			System.out.println(s.percentage);
			System.out.println("-----Result-----");
		}	
}

