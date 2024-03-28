package StructureCalculator;

public class Division implements MathOperationInterface{
    @Override
    public Nums operate(Nums a, Nums b) {
        double denominator = b.getValue() * b.getValue() + b.getI() * b.getI();
        double value = (a.getValue() * b.getValue() + a.getI() * b.getI()) / denominator;
        double i = (a.getI() * b.getValue() - a.getValue() * b.getI()) / denominator;
        return new Nums(value, i);
    }
}