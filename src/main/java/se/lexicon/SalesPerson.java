package se.lexicon;

public class SalesPerson extends Employee {

    private String[] clients;
    private int acquiredClients;

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    public void calculateSalary(){
        setSalary(getSalary() + (500 * clients.length) + (1000 * acquiredClients));
    }

    public String toString(){
        return "clients: " + clients + "\nacquiredClients: " + acquiredClients;
    }
}
