public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  public double getCharge(int DaysRented){
    //determine amounts for each line
    double thisAmount = 0;
    switch (this.getPriceCode()) {
        case Movie.REGULAR:
          thisAmount += 2;
          if (DaysRented > 2)
              thisAmount += (DaysRented - 2) * 1.5;
          break;
        case Movie.NEW_RELEASE:
          thisAmount += DaysRented * 3;
          break;
        case Movie.CHILDRENS:
          thisAmount += 1.5;
          if (DaysRented > 3)
              thisAmount += (DaysRented - 3) * 1.5;
            break;
    }

    return thisAmount;

  }

  public Movie(String title, int priceCode) {
      _title = title;
      _priceCode = priceCode;
  }

  public int getPriceCode() {
      return _priceCode;
  }

  public void setPriceCode(int arg) {
      _priceCode = arg;
  }

  public String getTitle (){
      return _title;
  }
}