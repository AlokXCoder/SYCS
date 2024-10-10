package methodoverloading;
class Adder {
 static int add(int a, int b) {
 {
 return a + b;
 }
 }
 static float add(float a, float b) {
 {
 return a + b;
 }
 }
}
public class MethodOverloadingg {
 public static void main(String[] args) {
 System.out.println("Addition of a and b is :");
 System.out.println(Adder.add(1, 2));
 System.out.println(Adder.add(2.3f, 4.5f));
 }
}
