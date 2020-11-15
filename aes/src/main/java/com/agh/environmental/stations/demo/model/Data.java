package com.agh.environmental.stations.demo.model;

import java.util.Arrays;

public class Data {
    String key;
    Value[] values;

    public String getKey() {
        return key;
    }

    public void setKey(String pKey) {
        key = pKey;
    }

    public Value[] getValues() {
        return values;
    }

    public void setValues(Value[] pValues) {
        values = pValues;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key='" + key + '\'' +
                ", values=" + Arrays.toString(values) +
                '}';
    }

}
