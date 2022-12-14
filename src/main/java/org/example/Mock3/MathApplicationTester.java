package org.example.Mock3;

import org.junit.Assert;
import org.junit.Before;
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


    @Before
    public void Setup(){
        mathsApplication = new MathsApplication();
        calculatorService = mock(CalculatorService.class);
        mathsApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void testAndaddSubstract(){
        when(calculatorService.add(20.0,10.0)).thenReturn(30.0);

        when(calculatorService.substract(20.0,10.0)).thenReturn(10.0);

        when(calculatorService.multiply(10.0,20.0)).thenReturn(200.0);
        verify(calculatorService).add(20.0,10.0);
        verify(calculatorService).substract(20.0,10.0);
        verify(calculatorService).multiply(20.0,10.0);
    }
    @Test(expected = RuntimeException.class)
    public void testAdd(){
        when(calculatorService.add(10.0,20.0)).thenReturn(30.00);

        // verify the behaviour of the class
        // verify(calculatorService).add(10.0,20.0);
        //verify(calculatorService,times(3)).add(10.0,20.0);
        //verify(calculatorService,never()).multiply(10.0,20.0);
        //verify(calculatorService,atLeastOnce()).substract(20.0,10.0);
        //verify(calculatorService,atLeast(1)).add(10.0,20.0);
        //verify(calculatorService,atMost(3)).add(10.0,20.0);
        // add the behaviour to throw exceptions //


        doThrow(new RuntimeException("")).when(calculatorService).add(10.0,20.0);

        // test the add functionality //
        Assert.assertEquals(mathsApplication.add(10.0,20.0),30.0,0);



    }
}
