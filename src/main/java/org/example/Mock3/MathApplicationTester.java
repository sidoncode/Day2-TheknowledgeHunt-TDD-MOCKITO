package org.example.Mock3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    // injecting the mock test cases //
    @InjectMocks
    MathsApplication mathsApplication = new MathsApplication();

    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd(){
        when(calculatorService.add(10.0,20.0)).thenReturn(30.00);

        Assert.assertEquals(mathsApplication.add(10.0,20.0),30.0,0);

        // verify the behaviour of the class
        // verify(calculatorService).add(10.0,20.0);

        //verify(calculatorService,times(3)).add(10.0,20.0);
        verify(calculatorService,never()).multiply(10.0,20.0);

        //verify(calculatorService,atLeastOnce()).substract(20.0,10.0);

        //verify(calculatorService,atLeast(1)).add(10.0,20.0);

        //verify(calculatorService,atMost(3)).add(10.0,20.0);



    }
}
