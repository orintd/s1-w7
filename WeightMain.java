public class WeightMain{
    public static void main(String[] args) {
        Weight w = new Weight(12);
        Weight w1 = new Weight(6,9);
        System.out.println(w.print());
        System.out.println(w1.print());
        System.out.println(w.isHeavier(w1));
        w1.multiple(12);
        System.out.println(w1.print());
    }
}