public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Bmi = service.calculate(69, 164);

        System.out.println(Bmi);
    }
}