package contructorover;
class St
{
 public St()
 {
 System.out.println("This is default constructor");
 }
 public St(int a, int b)
 {
 System.out.println(a+b);
 }
}
public class Contructorover{
 public static void main(String[] args) {
 St s= new St();
 St s1= new St(27,11);
 }
 
}



