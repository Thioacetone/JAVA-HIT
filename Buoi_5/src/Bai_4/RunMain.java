package Buoi_5.src.Bai_4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> sum = new Sum<Integer>(1, 1);
        System.out.println("1 + 1 = " + (sum.getA() + sum.getB()));

        Sum<Long> summ = new Sum<Long>(4L, 5L);
        System.out.println("4 + 5 = " + (summ.getA() + summ.getB()));

        Sum<Float> Sum = new Sum<Float>(2.1f, 5.f);
        System.out.println("2.1 + 5 = " + (Sum.getA() + Sum.getB()));

        Sum<Double> Summ = new Sum<Double>(3.4, 5.2);
        System.out.println("3.4 + 5.2 = " + (Summ.getA() + Summ.getB()));
    }
}
