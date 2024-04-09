package org.example.demo;

public class Privelege {
    int id;
    String name, condition, amount;

    public Privelege(int id, String name, String condition, String amount) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public String getAmount() {
        return amount;
    }
}
