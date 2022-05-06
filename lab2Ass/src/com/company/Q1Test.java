package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {
    Q1 i;
    @BeforeEach
    public void init(){
        i=new Q1();
    }

   @Nested
                            //CheckEvenAndOdd//
    public class EvenOddTest{
       @Test
       public void CheckingNumberTwo(){
           assertEquals("is even",i.CheckEvenOdd(2));
       }
       @Test
       public void CheckingNumberThree(){
           assertEquals("is odd",i.CheckEvenOdd(3));
       }
       @Test
       public void CheckingNumberFour(){
           assertEquals("is even",i.CheckEvenOdd(4));
       }
       @Test
       public void CheckingNumberFive(){
           assertEquals("is odd",i.CheckEvenOdd(5));
       }
       @Test
       public void CheckingNumberSix(){
           assertEquals("is even",i.CheckEvenOdd(6));
       }
       @Test
       public void CheckingNumberSeven(){
           assertEquals("is odd",i.CheckEvenOdd(7));
       }
       @Test
       public void CheckingNumberEight(){
           assertEquals("is even",i.CheckEvenOdd(8));
       }
       @Test
       public void CheckingNumberNine(){
           assertEquals("is odd",i.CheckEvenOdd(9));
       }
       @Test
       public void CheckingNumberTen(){
           assertEquals("is even",i.CheckEvenOdd(10));
       }
   }
   @Nested
   public class MaxMinValueTest{
                        //MaximumValue//
            @Test
            public void GetTheMaxValueOfFirstArray(){
                i.SetArray(new int[]{2,5,24,65,80});
                assertEquals(80,i.getMaxValue());
            }
            @Test
            public void GetTheMaxValueOfSecondArray(){
                i.SetArray(new int[]{2,5,24,65,0,1,3});
                assertEquals(65,i.getMaxValue());
            }
            @Test
            public void GetTheMaxValueOfThirdArray(){
                i.SetArray(new int[]{2,5,24,65,0});
                assertEquals(65,i.getMaxValue());
            }
            @Test
            public void GetTheMaxValueOfFourthArray(){
                i.SetArray(new int[]{90,100,9,50,6});
                assertEquals(100,i.getMaxValue());
            }

            @Test
            public void GetTheMaxValueOfNegArray(){
                i.SetArray(new int[]{-1,-16,-7,-6,-19,-200,-201,-66,-300});
                assertEquals(-1,i.getMaxValue());
            }
        //----------------------------------------------------///
                           //MinimumValue//
        @Test
        public void GetTheMinValueOfFirstArray(){
            i.SetArray(new int[]{2,5,24,65,80});
            assertEquals(2,i.getMinValue());
        }
       @Test
       public void GetTheMinValueOfSecondArray(){
           i.SetArray(new int[]{2,5,24,65,0});
           assertEquals(0,i.getMinValue());
       }
       @Test
       public void GetTheMinValueOfThirdArray(){
           i.SetArray(new int[]{2,5,24,65,-1});
           assertEquals(-1,i.getMinValue());
       }
       @Test
       public void GetTheMinValueOfFourthArray(){
           i.SetArray(new int[]{-1,100,9,50,-8});
           assertEquals(-8,i.getMinValue());
       }

       @Test
       public void GetTheMinValueOfNegArray(){
           i.SetArray(new int[]{-1,-190,-9,-6,-19,-100,-205,-76,-300});
           assertEquals(-300,i.getMinValue());
       }
   }
    @AfterEach
    public void CleanUp(){
        i=null;
    }

}