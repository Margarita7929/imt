public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 53;
        double height = 1.65;
        int imt = service.calculate(weight, height);
        System.out.println("Ваш Индекс Массы Тела " + imt);
    }
}
