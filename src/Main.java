public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(72,1.52);

        System.out.printf("Индекс массы тела %.1f",bmi);
    }
}
