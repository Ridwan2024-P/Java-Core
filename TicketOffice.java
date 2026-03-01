class TicketOffice {

    private int availableTickets = 100;

    public synchronized void sellTicket() {
        if (availableTickets > 0) {
            System.out.println("Portal [" + Thread.currentThread().getName() +
                    "] sold a ticket. Remaining: " + (--availableTickets));
        } else {
            System.out.println("Sold out!");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

class Portal implements Runnable {

    private TicketOffice office;

    public Portal(TicketOffice office) {
        this.office = office;
    }

    @Override
    public void run() {
        while (office.getAvailableTickets() > 0) {
            office.sellTicket();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class TicketOffice1 {

    public static void main(String[] args) throws InterruptedException {

        TicketOffice office = new TicketOffice();

        Thread portal1 = new Thread(new Portal(office), "Portal-1");
        Thread portal2 = new Thread(new Portal(office), "Portal-2");
        Thread portal3 = new Thread(new Portal(office), "Portal-3");

        portal1.start();
        portal2.start();
        portal3.start();

        portal1.join();
        portal2.join();
        portal3.join();

        System.out.println("Final Tickets Remaining: " + office.getAvailableTickets());
    }
}