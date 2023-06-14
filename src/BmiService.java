public class BmiService {
    public int calculate(int weight, int height) {
        int calc1;
        calc1 = weight * 10000;
        int calc2;
        calc2 = height * height;
        int calc3;
        calc3 = calc1 / calc2;
        return calc3;

    }
}

