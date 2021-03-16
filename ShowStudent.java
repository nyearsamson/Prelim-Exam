import java.util.Scanner;
public class ShowStudent {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter Student Id (please use only 4 digits)");
	       int Id = sc.nextInt();
	       System.out.println("Enter number of points: ");
	       int p = sc.nextInt();
	       System.out.println("Enter number of credit hours: ");
	       int cs = sc.nextInt();
	       Student s = new Student(Id, cs, p);
	       System.out.println(s);
	   }
	}