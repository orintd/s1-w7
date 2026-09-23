public class Weight {
    public int pounds;
    public int ounces;
    
    public Weight(int oz){
        this(0,oz);
    }

    public Weight(int lb, int oz){
        if (oz > 0){
            if (oz < 16){
                this.ounces = oz;
            }
        }
        if (lb > 0){
            this.pounds = lb;            
        }
    }

    public int totalOunces(){
        return this.ounces + 16 * this.pounds;
    }

    public boolean isHeavier(Weight wt){
        return this.totalOunces() > wt.totalOunces();
    }

    public void multiple(int m){
        if (m >= 0){
            int a = m * this.totalOunces();
            int b = a / 16;
            int c = a % b;
            this.pounds = b;
            this.ounces = c;
        }
    }

    public String print(){
        return this.pounds + " pounds " + this.ounces + " ounces "; 
    }
}
