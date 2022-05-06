package com.company;
public class Q1 {
    private int[] a;

    public String CheckEvenOdd(int num) //check parity
    {
        if(num % 2 == 0)
            return "is even";
        else
            return "is odd";
    }
    public int getMinValue() //return minimum number in an array
    {
        int min=a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (min>a[i])
                min=a[i];
        }
        return min;
    }
    public int getMaxValue()  //return maximum number in an array
    {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (max<a[i])
                max=a[i];
        }
        return max;
    }
    public void SetArray(int[] array){
        this.a=array.clone();
    }

}
