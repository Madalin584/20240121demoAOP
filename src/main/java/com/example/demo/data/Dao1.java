package com.example.demo.data;

import com.example.demo.aspect.TestAnnotation;
import com.example.demo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TestAnnotation(name = "Madalin")
    public String retrieveSomething() {
        return "Dao1";
    }
}
