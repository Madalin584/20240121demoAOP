package com.example.demo.business;

import com.example.demo.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        return dao2.retrieveSomething();
    }
}
