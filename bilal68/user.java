public class User {
    private String username;
    private String password;
    private double saldo;
    private ArrayList<Ticket> tickets;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.saldo = 0.0;
        this.tickets = new ArrayList<>();
    }

    
}