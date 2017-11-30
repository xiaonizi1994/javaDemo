package com.thoughtworks.demo.service.Radiator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LifeSupportSim {
    public List main() {
        ArrayList aList = new ArrayList();
        V2Radiator v2Radiator = new V2Radiator(aList);
        V3Radiator v3Radiator = new V3Radiator(aList);
        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }
        return aList;
    }
}
