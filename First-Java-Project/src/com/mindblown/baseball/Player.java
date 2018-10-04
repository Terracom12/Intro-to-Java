package com.mindblown.baseball;

public class Player extends Person
{
    private int uniformNumber;
    private double battingAverage;
    private double era;
    private Team team;


    public Player() { this.team = new Team(); }


    public int getUniformNumber() {
        return uniformNumber;
    }
    public void setUniformNumber(int uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    public double getBattingAverage() {
        return battingAverage;
    }
    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getEra() {
        return era;
    }
    public void setEra(double era) {
        this.era = era;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
}
