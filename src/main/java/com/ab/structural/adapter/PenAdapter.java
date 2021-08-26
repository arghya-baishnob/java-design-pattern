package com.ab.structural.adapter;

import com.ab.structural.adapter.provider.PilotPen;

public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();

    @Override
    public void write(String line) {
        pp.mark(line);
    }
}
