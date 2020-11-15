package com.agh.environmental.stations.demo.service;

import com.agh.environmental.stations.demo.model.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataService {
    public Double getAirQualityIndex(List<Data> pData) {
        List<Data> pM10 = pData.stream().filter(a -> a.getKey().equals("PM10")).collect(Collectors.toList());
        List<Data> o3= pData.stream().filter(a -> a.getKey().equals("O3")).collect(Collectors.toList());
        List<Data> c6H6 = pData.stream().filter(a -> a.getKey().equals("C6H6")).collect(Collectors.toList());
        List<Data> nO2 = pData.stream().filter(a -> a.getKey().equals("NO2")).collect(Collectors.toList());

        double airQualityIndex = 0.0;
        double pM10Quality = 0.0;
        double pO3Quality = 0.0;
        double pC6H6Quality = 0.0;
        double pNO2Quality = 0.0;

        for (Data d : pM10) {
            String value = d.getValues()[3].getValue();
            if(value != null) {
                pM10Quality += Double.valueOf(value).doubleValue();
            }
        }
        if(pM10Quality != 0) {
            pM10Quality = pM10Quality / pM10.size();
        }

        for (Data d : o3) {
            String value = d.getValues()[3].getValue();
            if(value != null ) {
                pO3Quality += Double.valueOf(value).doubleValue();
            }
        }
        if(pO3Quality != 0) {
            pO3Quality = pO3Quality / o3.size();
        }

        for (Data d : c6H6) {
            String value = d.getValues()[3].getValue();
            if(value != null ) {
                pC6H6Quality += Double.valueOf(value).doubleValue();
            }
        }
        if(pC6H6Quality != 0) {
            pC6H6Quality = pC6H6Quality / c6H6.size();
        }

        for (Data d : nO2) {
            String value = d.getValues()[3].getValue();
            if(value != null ) {
                pNO2Quality += Double.valueOf(value).doubleValue();
            }
        }
        if(pNO2Quality != 0) {
            pNO2Quality = pNO2Quality / nO2.size();
        }

        airQualityIndex = (pM10Quality + pO3Quality + pC6H6Quality + pNO2Quality)/4;


        return Double.valueOf(airQualityIndex);
    }
}
