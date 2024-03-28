
import StructureCalculator.Calculator;
import StructureCalculator.Division;
import StructureCalculator.Nums;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    //пришлось подсмотреть, как делать, так как не знал сто такое комплексные числа,
    // писал обычный калькулятор, но мне времени не хватило
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final Scanner scanner = new Scanner(System.in);
    private static Nums inputNums() {
        System.out.print("Введите реальную часть: ");
        double value = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double i = scanner.nextDouble();
        return new Nums(value, i);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Division());
        System.out.println("Введите первое  число");
        Nums a = inputNums();
        System.out.println("Введите второе  число");
        Nums b = inputNums();
        Nums result = calculator.calculate(a, b);
        System.out.println("результат: " + result);
    }
}