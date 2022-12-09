import java.util.LinkedList;
import java.util.Queue;

class  ClientService {
    public static void main(String[] args) {
        Queue<Client> clients = new LinkedList<>();

        clients.add(new Client("Karol"));
        clients.add(new Client("Patrycja"));
        clients.add(new Client("Andrzej"));
        clients.add(new Client("Karolina"));


        //peak() poll()
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());
        System.out.println("Obsługiwany klient " + clients.poll());

        System.out.println(clients);
    }

}
