package Labs.Lab08.Ex2CallCenter;

public class Operator extends Employee{
    private static int countOperator = 1;

    public Operator(String name) {
        super(name, "Оператор " + countOperator);
        countOperator++;
    }
}