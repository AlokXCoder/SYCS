package methodoverriding;
class A
{
 void show()
 {
 System.out.println("Base Class");
 }
}
class B extends A
{
 void show()
 {
 System.out.println("Derived Class");
 }
}
public class MethodOverRiding {
 public static void main(String[] args) {
 B b=new B();
 b.show();
 }
}
