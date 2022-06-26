public abstract class Price {
   public abstract int getPriceCode();
  
   public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented) {
    int frequentRenterPoints = 0;

    if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) frequentRenterPoints ++;

    frequentRenterPoints ++;

    return frequentRenterPoints;
  }
} 