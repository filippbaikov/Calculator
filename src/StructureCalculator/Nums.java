package StructureCalculator;

public class Nums {
    private final double value;
    private final double i;

    public Nums(double value, double i) {
        this.value = value;
        this.i = i;
    }

    public double getValue() {
        return value;
    }

    public double getI() {
        return i;
    }

    @Override
    public String toString() {
        return value + (i >= 0 ? "+" : "") + i + "i";
    }
}