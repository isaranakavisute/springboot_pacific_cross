package com.example.super_springboot;

import java.util.List;

public class MockReturn {
    private final int qreceipt;
    private final String qtime;
    private final int qwaiting;
    private NestedData data = null;

    public MockReturn(int qreceipt, String qtime, int qwaiting, NestedData data) {
        this.qreceipt = qreceipt;
        this.qtime = qtime;
        this.qwaiting = qwaiting;
        this.data = data;
    }

    public int getQreceipt() {
        return qreceipt;
}

    public String getQtime() {
        return qtime;
    }

    public int getQwaiting() {
        return qwaiting;
    }

    public NestedData getData()  { return data; }
}
