package org.example.demo;

public class Ticket {
    int id, amount;
    String name, lName, fName, ticket;

    public Ticket(String name, String lName, String fName, String ticket, int amount) {
        this.name = name;
        this.lName = lName;
        this.fName = fName;
        this.ticket = ticket;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public String getTicket() {
        return ticket;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
