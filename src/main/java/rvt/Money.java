package rvt;

public class Money {

        private final int euros;
        private final int cents;
    
        public Money(int euros, int cents) {
            this.euros = euros;
            this.cents = cents;
        }
    
        public int getEuros() {
            return euros;
        }
    
        public int getCents() { 
            return cents;
        }
    
        public String toString() {
            String zero = (cents < 10) ? "0" : "";
            return euros + "." + zero + cents + "e";
        }
    
        public Money plus(Money addition) {
            int newEuros = euros + addition.getEuros();
            int newCents = cents + addition.getCents();
            
            if (newCents >= 100) {
                newEuros += newCents / 100;
                newCents %= 100;
            }
    
            return new Money(newEuros, newCents);
        }
    
        public boolean lessThan(Money compared) {
            return (euros < compared.getEuros()) || (euros == compared.getEuros() && cents < compared.getCents());
        }
    
        public Money minus(Money decreaser) {
            int newEuros = euros - decreaser.getEuros();
            int newCents = cents - decreaser.getCents();
            
            if (newCents < 0) {
                newEuros -= 1;
                newCents += 100;
            }
    
            return new Money(newEuros, newCents);
        }
    
        public static void main(String[] args) {
            Money a = new Money(10, 0);
            Money b = new Money(5, 0);
            
            Money c = a.plus(b);
            
            System.out.println(a);  // 10.00e
            System.out.println(b);  // 5.00e
            System.out.println(c);  // 15.00e
            
            a = a.plus(c);
            
            System.out.println(a);  // 25.00e
            System.out.println(b);  // 5.00e
            System.out.println(c);  // 15.00e
    
            Money d = new Money(10, 0);
            Money e = new Money(3, 0);
            Money f = new Money(5, 0);
    
            System.out.println(d.lessThan(e));  // false
            System.out.println(e.lessThan(f));  // true
    
            Money g = new Money(10, 0);
            Money h = new Money(3, 50);
    
            Money i = g.minus(h);
    
            System.out.println(g);  // 10.00e
            System.out.println(h);  // 3.50e
            System.out.println(i);  // 6.50e
    
            i = i.minus(g);
    
            System.out.println(g);  // 10.00e
            System.out.println(h);  // 3.50e
            System.out.println(i);  // 0.00e
        }
    
    }
