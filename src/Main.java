public class Main {
    public static void main(String[] args) {
        int number = 1000;
        Controller controller = new Controller(number);
        System.out.println("The number after convert to binary: " + controller.change());
    }
}
