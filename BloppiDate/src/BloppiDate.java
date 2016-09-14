
public class BloppiDate {
    private final int year;
    private final int month;
    private final int day;

    public BloppiDate(int year, int month, int day) {
        if (month > 11 || month < 0) { throw new IllegalArgumentException("Month out of bounds"); }
        if (day > 29 || day < 0) { throw new IllegalArgumentException("Day out of bounds"); }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public BloppiDate AddDays(int days) {
        return new BloppiDate(year, month, day);
    }

    public int DiffDays(BloppiDate other) {
        return 0;
    }
}
