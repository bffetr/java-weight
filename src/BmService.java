public class BmService {

    public int calculate(int weight, int height) {
        int index = 10_000 * weight / (height * height);
        return index;

    }
}
