package Interfaces;

interface S
{
public void show();
}
interface T extends S
{
public void display();
}
class An implements T
{
public void show()
{
System.out.println("From Intreface S");
}
public void display()
{
System.out.println("From Interface T");
}
}
public class Interface {
public static void main(String[] args)
{
An a=new An();
a.show();
a.display();
}
}