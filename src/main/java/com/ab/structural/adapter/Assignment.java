package com.ab.structural.adapter;

public class Assignment {
    Pen p;

    public void writeAssignment(String content) {
        p.write(content);
    }

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }
}
