package org.example.Mock2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    // injecting the mock test cases //
    @InjectMocks
    MathsApplication mathsApplication = new MathsApplication();

    @InjectMocks
    MathsApplication mathsApplication2 = new MathsApplication();

    @Mock
    CalculatorService calculatorService;
    @Mock
    CalculatorService calculatorService2;

    @Test
    public void testAdd(){
        when(calculatorService.add(10.0,20.0)).thenReturn(30.00);

        when(calculatorService2.add(10.0,20.0)).thenReturn(40.00);

        Assert.assertEquals(mathsApplication.add(10.0,20.0),30.0,0);
        Assert.assertEquals(mathsApplication2.add(10.0,20.0),30.0,0);
    }
}
