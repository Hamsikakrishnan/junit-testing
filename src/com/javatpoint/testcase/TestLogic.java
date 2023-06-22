package com.javatpoint.testcase;  
  
import static org.junit.Assert.*;  
import com.javatpoint.logic.*;  
import org.junit.Test;  
  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(10,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-22,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  