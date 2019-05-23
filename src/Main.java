public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan(Fan.getFAST(), true, 10, "yellow");
        System.out.println(fan.toString());
        Fan fan1 = new Fan(Fan.getMEDIUM(), false,5,"bleu");
        System.out.println(fan1.toString());

    }
}
