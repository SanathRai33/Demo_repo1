class student
{
 int rollno;
 String name;
 int marks;
void getdata(int rno,String n,int m)
 {
  rollno=rno;
  name=n;
  marks=m;
 }
void putdata()
 {
  System.out.println("Roll no="+rollno);
  System.out.println("Name="+name);
  System.out.println("Marks="+marks);
 }
}
class studentdemo
{
 public static void main(String args[])
  {
   student s=new student();
    s.getdata(1111,"Rama",680);
    s.putdata();
  }
}
