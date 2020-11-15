package com.agh.environmental.stations.demo.model;

public class Value {
    String date;
    String value;

    public String getDate() {
        return date;
    }

    public void setDate(String pDate) {
        date = pDate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String pValue) {
        value = pValue;
    }

    @Override
    public String toString() {
        return "Value{" +
                "date='" + date + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
