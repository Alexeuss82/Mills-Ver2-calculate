public class BonusMilesService {
    public int calculate(int price) {
        int oneBonusMill = price / 20;
        int cost = price / oneBonusMill;
        return cost;
    }

}
// public static void main(String[] args) {
// int amountTicket = 1000;
// int oneBonusMill = amountTicket / 20;
//  int ticketBonusMills = amountTicket / oneBonusMill;
// System.out.println("Вам начислено " + ticketBonusMills + " бонусных милль!");