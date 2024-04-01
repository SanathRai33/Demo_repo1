class student
{
 int rollno;
 String name;
 int marks;
 student()
 {
  rollno=111;
  name="Rama";
  marks=680;
 }
void putdata()
 {
  System.out.println("Rollno="+rollno);
  System.out.println("Name="+name);
  System.out.println("Marks="+marks);
  }
}
class studentdemo1
{
 public static void main(String args[])
 {
  student s=new student();
  s.putdata();
 }
}
