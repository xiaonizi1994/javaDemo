package com.thoughtworks.demo.service;

import com.thoughtworks.demo.service.Radiator.LifeSupportSim;
import com.thoughtworks.demo.service.Radiator.SimUnit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LifeSupportSimTest {

    @Test
    void should() {
        LifeSupportSim lifeSupportSim=new LifeSupportSim();
        List alist=lifeSupportSim.main();
        List except= new ArrayList();
        SimUnit v2Radiator=new SimUnit("V2Radiator");
        SimUnit v3Radiator=new SimUnit("V3Radiator");
        SimUnit retention=new SimUnit("Retention");

        for(int i=0;i<5;i++){
            except.add(v2Radiator);
        }

        for(int i=0;i<5;i++){
            except.add(v2Radiator);
        }

        for(int i=0;i<10; i++){
            except.add(v3Radiator);
        }

        for(int i=0;i<20;i++){
            except.add(retention);
        }
        assertEquals(except.size(),alist.size());
    }
}
