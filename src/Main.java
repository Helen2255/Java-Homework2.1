public class Main {
    public static void main(String[] args) {
        float ticket = 25600.10F;
        int priceMili = 20;
        int amountMili = (int) ticket / priceMili;
        System.out.println("Количество миль:"+ amountMili);
    }
}
