
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        int eurosN = this.euros + added.euros;
        int centsN = this.cents + added.cents;
        if(centsN > 99) {
            eurosN += centsN/100;
            centsN %= 100;
        }
        Money output = new Money(eurosN, centsN);
        return output;
    }
    
    public Money minus(Money decremented) {
        int eurosN = 0;
        int centsN = 0;
        int centsTotal = ((this.euros*100)+this.cents) - ((decremented.euros*100) + decremented.cents);
        if(centsTotal < 0) {
            Money output = new Money(eurosN, centsN);
            return output;
        }
        if(centsTotal>99) {
            eurosN += centsTotal/100;
            centsN = centsTotal%=100;
        }
        Money output = new Money(eurosN, centsN);
        return output;
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
