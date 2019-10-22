
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int difference = 0;
        int differenceF = (this.year*365 + (this.month - 1) * 30 + this.day);
        int differenceS = (compared.year*365 + (compared.month - 1) * 30 + compared.day);
        if(differenceF >= differenceS) {
            difference = differenceF - differenceS;
        } else {
            difference = differenceS - differenceF;
        }
        return difference/365;
    }

  
}
