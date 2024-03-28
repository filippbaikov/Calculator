package StructureCalculator;

public class Mult implements MathOperationInterface {
    @Override
    public Nums operate(Nums a, Nums b) {
        double value = a.getValue() * b.getValue() - a.getI() * b.getI();
        double i = a.getValue() * b.getI() + a.getI() * b.getValue();
        return new Nums(value, i);
    }
}
