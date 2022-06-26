import java.util.Enumeration;

public class HtmlStatement extends Statement {private String[] texto = {"<H1>Rentals for <EM>", "</EM></H1><P>\n", "", ": ", "<BR>\n", "<P>You owe <EM>", "</EM><P>\n", "On this rental you earned <EM>", "</EM> frequent renter points<P>"};

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
  texto[8];
  return result;
  }
}   