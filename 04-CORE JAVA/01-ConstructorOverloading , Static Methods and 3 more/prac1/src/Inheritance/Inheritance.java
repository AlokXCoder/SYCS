package Inheritance;
class Demo
{
 void display()
 {
 System.out.println("Hello Jarvis");
 }
}
class A extends Demo
{
 void sqr(int a)
 {
 System.out.println(a*a);
 }
}
class B extends Demo
{
 void cube(int b)
 {
 System.out.println(b*b*b);
 }
}
public class Inheritance {
 public static void main(String[] args) {
 A s=new A();
 s.sqr(2);
 s.display();
 B s1=new B();
 s1.cube(4);
 s1.display();
 }
}