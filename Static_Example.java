import java.util.*;
class Static_Example {
       public String name;
       protected String E_mail;
       static String Driver;
      void input()
      { 
          Scanner s=new Scanner(System.in);
          
          System.out.println("enter name");
          name= s.next();
          System.out.println("enter email");
          E_mail=s.next();
          System.out.println("enter name");
          Driver=s.next();
     }
      static void banner()
      {
          Driver= "hello world";
      }

void display()
{      System.out.println(name + E_mail + Driver);

	}
    public static void main(String args[])
    {
        Static_Example e=new Static_Example();
        e.input();
        Static_Example.banner();
      e.display();
    }
}
