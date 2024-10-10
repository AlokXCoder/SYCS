package abstractclass;
import java.util.*;
abstract class Base {
 protected float r, vol;
 public void read(float x) {
 r = x;
 }
 public abstract void calculate();
 public void display() {
 System.out.println("The volume is :" + vol);
 }
}
class Sphere extends Base {
 public void calculate() {
 vol = 3.14f * r * r * r * 4 / 3;
 }
}
public class AbstractClass {
 public static void main(String[] args) {
 float x;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius:");
 x = sc.nextFloat();
 Sphere s = new Sphere();
 s.read(x);
 s.calculate();
 System.out.println("Sphere:");
 s.display();
 }
}
