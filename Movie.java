public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private Price _price;
  private int frequentRenterPoints = 0;

  public Movie(String name, int priceCode) {
      _title = name;
      setPriceCode(priceCode);
   }

   public int getPriceCode() {
      return _price.getPriceCode();
   }

   public void setPriceCode(int arg) {
      switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
         case CHILDRENS:
            _price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
   }

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
  
  public int getFrequentRenterPoints(int daysRented) {

    if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) frequentRenterPoints ++;

    frequentRenterPoints ++;

    return frequentRenterPoints;

   }

  
  public String getTitle (){
      return _title;
  }
}