abstract class  subject {

   public abstract float getPercentage();

}

class A extends subject
{

   int subject1, subject2, subject3;

   A(int marks1, int marks2, int marks3){

       subject1=marks1;

       subject2=marks2;

       subject3=marks3;

   }

   public float getPercentage(){

       float total=((subject1+subject2+subject3)/(float)300)*100;

       return total;

   }

}

class B extends subject{

   int subject1, subject2, subject3, subject4;

   B(int marks1, int marks2, int marks3, int marks4){

       subject1=marks1;

       subject2=marks2;

       subject3=marks3;

       subject4=marks4;

   }

   public float getPercentage(){

       float total=((subject1+subject2+subject3+subject4)/(float)400)*100;

       return total;

   }

}
public class PercentageCal

{

public static void main(String[] args) {

    A a = new A(80, 90, 92);

       System.out.println(a.getPercentage());

       B b = new B(90, 75, 94, 86);

       System.out.println(b.getPercentage());

}
}