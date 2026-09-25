public class Not {
    public boolean areIncreasing(int a, int b, int c){
        // return a < b && b < c;
        return !(a >= b || b >= c);
    }

    public boolean hasSameSign(int a, int b){
        if (!(a==0 || b==0)){
            return (Math.abs(a)/a) == (Math.abs(b)/b);
        }
        else if (a == 0 && b ==0){
            return true;
        }
        return false;
        
    }
}
