import java .util.*;
class GradeSystem{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

float math,eng,sci,comp,hindi,avg;

System.out.println("Enter marks in Maths: ");
math=sc.nextFloat();

System.out.println("Enter marks in English: ");
eng=sc.nextFloat();

System.out.println("Enter marks in Science: ");
sci=sc.nextFloat();

System.out.println("Enter marks in Computer: ");
comp=sc.nextFloat();

System.out.println("Enter marks in Hindi: ");
hindi=sc.nextFloat();

avg = (math+eng+sci+comp+hindi)/5;

if(avg>=90.0 && avg<=100.0)
{
System.out.println(" Total Marks : "+ avg);
System.out.println(" Grade : A+");

}
else if( avg<90.0 && avg>=80.0)
{
System.out.println(" Total Marks :" + avg);
System.out.println(" Grade : A");
}
else if( avg<80.0 && avg>=70.0)
{
System.out.println(" Total Marks : "+ avg);
System.out.println(" Grade : B+");
}
else if( avg<70.0 && avg >=60.0)
{
System.out.println(" Total Marks :" + avg);
System.out.println(" Grade : B");
}
else if( avg<60.0 && avg >=50.0)
{
System.out.println(" Total Marks : " + avg);
System.out.println(" Grade : C+");
}
else if( avg<50.0 && avg >=40.0)
{
System.out.println(" Total Marks : " + avg);
System.out.println(" Grade : C");
}
else
{
System.out.println(" Total Marks : "+ avg);
System.out.println(" Grade : D");
System.out.println(" Better luck next time!");
}
}
}





