public abstract class Price {
   public abstract int getPriceCode();

  public double getCharge(int DaysRented){

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
} 