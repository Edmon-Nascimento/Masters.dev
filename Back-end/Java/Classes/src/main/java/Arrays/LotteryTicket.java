package Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < ticket.length; i++) {
            do {
                randomNumber = random.nextInt(1, MAX_TICKET_NUMBER);
            }while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearch) {
        for(int value : array) {
            if(value == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int[] ticket) {
        Arrays.sort(ticket);
        for(int value : ticket) {
            System.out.print(value + " ");
        }
    }

}
