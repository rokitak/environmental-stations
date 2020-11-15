package com.agh.environmental.stations.demo.controller;


import com.agh.environmental.stations.demo.model.Data;
import com.agh.environmental.stations.demo.model.Sensor;
import com.agh.environmental.stations.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StationController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DataService dataService;
    @GetMapping("/getAirQualityIndex")
    public Double createProduct() {
        //getSensorsForAppropriateCity
        String[] cracowSensors = new String[]{"401", "402", "10121", "10123", "10139", "10447", "11303"};
        List<Sensor> sensors = new ArrayList<>();
        List<Data> data = new ArrayList<>();
        for (String sensor : cracowSensors) {
            sensors.addAll(Arrays.asList(restTemplate.getForEntity("http://api.gios.gov.pl/pjp-api/rest/station/sensors/" + sensor, Sensor[].class).getBody()));
        }
        for (Sensor sensor : sensors) {
            data.add(restTemplate.getForEntity("http://api.gios.gov.pl/pjp-api/rest/data/getData/" + sensor.getId(), Data.class).getBody());
        }
        data.stream().forEach(a -> System.out.println(a.toString()));
        return dataService.getAirQualityIndex(data);
    }

    @GetMapping("/getSensors")
    public String getSensors() {

        return null;
    }

}