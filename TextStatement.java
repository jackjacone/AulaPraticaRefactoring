import java.util.Enumeration;
import java.util.*;

public class TextStatement extends Statement {
   private String[] texto = {"Rental Record for ", "\n", "\t", "\t", "\n", "Amount owed is ", "\n", "You earned ", " frequent renter points"};

  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = texto[0] + aCustomer.getName() +
      texto[1];
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += texto[2] + each.getMovie().getTitle()+ texto[3] +
         String.valueOf(each.getCharge()) + texto[4];
      }
      //add footer lines
      result += texto[5] +
      String.valueOf(aCustomer.getTotalCharge()) + texto[6];
      result += texto[7] +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      texto[8];;
      return result;
   }
}  