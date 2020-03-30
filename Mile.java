public class Mile {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket = 1000, bonus = service.calculate(priceTicket);
        System.out.println("Количество миль: " + bonus);
    }
}
