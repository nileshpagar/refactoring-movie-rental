/**
 * Created by NileshPagar at gmail dot com on 2/19/17.
 */
class RegularPrice extends Price {

    @Override
    public double calculateAmount(int _daysRented) {
        double thisAmount = 0;
        thisAmount += 2;
        if (_daysRented > 2)
            thisAmount += (_daysRented - 2) * 1.5;
        return thisAmount;
    }

    @Override
    public int calculateFrequentRenterPoints(int _daysRented) {
        return 1;
    }
}
