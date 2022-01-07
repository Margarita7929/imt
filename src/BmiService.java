public class BmiService {
    public int calculate(int weight, double height) {
        double imt = weight / (height * height);
        return (int) imt;
    }
}
