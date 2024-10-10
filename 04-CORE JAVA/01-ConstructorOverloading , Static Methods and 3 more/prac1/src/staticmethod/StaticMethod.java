package staticmethod;
class StCount {
 static int count = 0;
 StCount() {
 count++;
 System.out.println(count);
 }
}
public class StaticMethod {
 public static void main(String[] args) {
 StCount c1 = new StCount();
 StCount c2 = new StCount();
 StCount c3 = new StCount();
 }
} 
