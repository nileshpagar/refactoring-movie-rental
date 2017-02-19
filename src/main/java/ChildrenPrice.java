/**
 * Created by NileshPagar at gmail dot com on 2/19/17.
 */
class ChildrenPrice extends Price {

    public double calculateAmount(int _daysRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (_daysRented > 3)
            thisAmount += (_daysRented - 3) * 1.5;
        return thisAmount;
    }

    public int calculateFrequentRenterPoints(int _daysRented) {
        return 1;
    }
}
