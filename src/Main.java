public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 170;//cm.
        double weight = 98; //kg.
        double BodyMassIndex = service.calculate(height, weight);
        System.out.printf("Ваш индекс массы тела  %.2f",  BodyMassIndex);
    }
}