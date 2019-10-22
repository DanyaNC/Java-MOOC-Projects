public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int difference = 0;
        int differenceF = (this.year*365 + (this.month - 1) * 30 + this.day);
        int differenceS = (comparedDate.year*365 + (comparedDate.month - 1) * 30 + comparedDate.day);
        if(differenceF >= differenceS) {
            difference = differenceF - differenceS;
        } else {
            difference = differenceS - differenceF;
        }
        return difference/365;
    }

}
