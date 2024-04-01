class student5
{
int rollno;
String name;
int marks;
static int instcode=391;
	
void getdata(int rno,String n,int m)
{
rollno=rno;
name=n;
marks=m;
}

void putdata()
{
System.out.println("\n\nInstitution code="+instcode);
System.out.println("Roll no="+rollno);
System.out.println("Name="+name);
System.out.println("Marks="+marks);
}
}
class studentdemo5
{
public static void main(String args[])
{
student S1=new student();
S1.getdata(111,"Rama",620);
S1.putdata();

student S2=new student();
S2.getdata(115,"Seeta",570);
S2.putdata();
}
}
