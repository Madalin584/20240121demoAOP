package com.example.demo.data;

import com.example.demo.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
    public String retrieveSomething() {
        return "Dao2";
    }
}
