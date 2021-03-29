
import java.util.Scanner;

public class Student {
	   private double GP;
	   private int ID;
	   private int Credits;
	   private int points;
	   

	   public Student()
	   {
	   }
	   
	   public int getID()
	   {
	       return ID;
	   }

	   public void setID(int aID)
	   {
	       ID = aID;
	   }

	   public int getCredits()
	   {
	       return Credits;
	   }

	   public void setCredits(int aCredits)
	   {
	       Credits = aCredits;
	   }

	   public int getPoints()
	   {
	       return points;
	   }

	   public void setPoints(int aPoints)
	   {
	       points = aPoints;
	   }
	   
	   public Student(int aID, int aCredits, int aPoints) 
	   {
	       super();
	       ID = aID;
	       Credits = aCredits;
	       points = aPoints;
	       GPcalculator();
	   }

	   public String toString() {
	       return "ID : " + ID + " Credits : " + Credits + " Points : " + points + " Grade Point : "
	               + GP;
	   }

	  
	   public void GPcalculator() {
	       GP = points / (double) Credits;
	   }
	}
