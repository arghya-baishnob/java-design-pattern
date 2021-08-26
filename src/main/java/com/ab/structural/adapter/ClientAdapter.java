package com.ab.structural.adapter;

public class ClientAdapter {
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        assignment.setP(new PenAdapter());
        assignment.writeAssignment("Lets start the work !!!");
    }
}
