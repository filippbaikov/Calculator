package StructureCalculator;

public class Addition implements MathOperationInterface{
    @Override
    public Nums operate(Nums a, Nums b) {
        return new Nums(a.getValue() + b.getValue(), a.getI() + b.getI());
    }
}