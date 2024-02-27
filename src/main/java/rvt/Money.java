public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(addition.euros() + this.euros(), addition.cents() + this.cents()); // create a new Money object that has the correct worth

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (compared.euros() + compared.cents() / 100 > this.euros() + this.cents() / 100) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {

        int newValue = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
        if (newValue >= 0) {
            Money newMoney = new Money(newValue / 100, newValue % 100);
            return newMoney;    
        } else {
            Money newMoney = new Money(0, 0);
            return newMoney;

        }

    }
}