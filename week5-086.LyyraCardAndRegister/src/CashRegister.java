
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double econprice = 2.50;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= econprice) {
            //    the price of lunch is added to register
            this.cashInRegister += econprice;
            //    the amount of sold lunch is incremented by one
            this.economicalSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - econprice;
        }
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetprice = 4.00;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= gourmetprice) {
            //    the price of lunch is added to register
            this.cashInRegister += gourmetprice;
            //    the amount of sold lunch is incremented by one
            this.gourmetSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - gourmetprice;
        }
        // if not enough money given, all is returned and nothing else happens

        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double econprice = 2.50;
        if (card.pay(econprice)) {
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double gourmetprice = 4.00;
        if (card.pay(gourmetprice)) {
            this.gourmetSold++;
            return true;         
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
