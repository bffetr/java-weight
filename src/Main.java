public class Main {
    public static void main(String[] args) {
        BmService service = new BmService();
        int a = 56;
        int b = 160;
        int index = service.calculate(a, b);
        System.out.println(index);
    }
}
