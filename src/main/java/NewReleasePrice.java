/**
 * Created by NileshPagar at gmail dot com on 2/19/17.
 */
class NewReleasePrice extends Price {

    public double calculateAmount(int _daysRented) {
        double thisAmount = 0;
        thisAmount += _daysRented * 3;
        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int _daysRented) {
        if (_daysRented > 1)
            return 2;
        return 1;
    }
}
