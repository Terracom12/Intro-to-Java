package com.mindblown.baseball;

public class Team
{
    private String name;
    private Person manager;
    private Player[] players;

    public Team() { this.manager = new Person(); }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person getManager() {
        return manager;
    }
    public void setManager(Person manager) {
        this.manager = manager;
    }
}
