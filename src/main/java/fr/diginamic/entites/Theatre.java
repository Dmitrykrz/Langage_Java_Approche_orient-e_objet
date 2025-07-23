package fr.diginamic.entites;

public class Theatre {

    String name;
    int maxCapacity;
    int totalClients;
    double totalRevenue;

    public Theatre(String name, int maxCapacity) {
        if (name.isEmpty() || maxCapacity<0 )
            throw new IllegalArgumentException("wrong argument when creating theater");
        else {
            this.name = name;
            this.maxCapacity = maxCapacity;
            this.totalClients = 0;
            this.totalRevenue = 0.0;
        }
    }

    public void inscrire(int numberOfClients, double ticketPrice) {
        if (this.totalClients + numberOfClients <= this.maxCapacity) {
            this.totalClients += numberOfClients;
            this.totalRevenue += numberOfClients * ticketPrice;
        } else {
            throw new IllegalArgumentException("Maximum capacity reached.");
        }
    }

    public double getTotalRevenue(){
        return this.totalRevenue;
    }
    public double getTotalClients(){
        return this.totalClients;
    }
    public String getName(){
        return this.name;
    }

}