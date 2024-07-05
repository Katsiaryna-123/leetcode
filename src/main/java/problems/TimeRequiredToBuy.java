package problems;

public class TimeRequiredToBuy {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        
        while (tickets[k] != 1) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    time++;
                }
            }
        }
        
        for (int i = 0; i <= k; i++) {
            if (tickets[i] > 0) {
                tickets[i]--;
                time++;
            }
        }
        
        return time;
    }
    
    public int timeRequiredToBuyOptimal(int[] tickets, int k) {
        int ticketsForK = tickets[k];
        int time = 0;
        
        for (int i = 0; i <= k; i++) {
            time = time + Math.min(ticketsForK, tickets[i]);
        }
        
        for (int i = k + 1; i < tickets.length; i++) {
            time = time + Math.min(ticketsForK - 1, tickets[i]);
        }
        
        return time;
    }
}
