package org.example.demo;

public class Flight {
    int id;
    String name, path, start, end, startTime, endTime;

    public Flight(String name, String path, String start, String end, String startTime, String endTime) {
        this.name = name;
        this.path = path;
        this.start = start;
        this.end = end;
        this.startTime = startTime;
        this.endTime = endTime;
        id = name.length() - 1 + end.length();
    }



}
