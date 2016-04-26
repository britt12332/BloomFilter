package com.example.brittany.bloomfilter;

import java.util.BitSet;

/**
 * Created by brittany on 4/22/2016.
 */
public class BitArray
{
    private int mValue = 18;
    private int kValue = 3;


    public void setkValue(int kValue) {
        this.kValue = kValue;
    }

    public void setmValue(int mValue) {
        this.mValue = mValue;
    }



    public int getmValue() {
        return mValue;
    }
    public int getkValue() {
        return kValue;
    }





    public void firstHashFunct(int value)
    {
        BitArrayCore.theSet[0] = value;
        int generatedNum = value;
        generatedNum = Math.abs(Math.round((generatedNum/2)));
        BitArrayCore.allVals[generatedNum] = 1;
        System.out.println("here" + generatedNum);

    }
    public void secondHashFunct(int value)
    {
        BitArrayCore.theSet[1] = value;
        int generatedNum = value;
        generatedNum = Math.abs(Math.round(generatedNum-2));
        BitArrayCore.allVals[generatedNum] = 1;
        System.out.println("here" + generatedNum);


    }
    public void thirdHashFunct(int value)
    {
       BitArrayCore.theSet[2] = value;
        int generatedNum = value;
        generatedNum = Math.abs(Math.round(generatedNum-5)*1);
        BitArrayCore.allVals[generatedNum] = 1;
        System.out.println("here" + generatedNum);

    }

}
