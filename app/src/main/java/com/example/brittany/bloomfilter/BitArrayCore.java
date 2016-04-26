package com.example.brittany.bloomfilter;

/**
 * Created by brittany on 4/22/2016.
 */
public class BitArrayCore
{
    static Byte[] allVals;
    static int[] theSet;




    static void BuildArray()
    {
        BitArray b = new BitArray();
        theSet = new int[b.getkValue()];
        allVals = new Byte[b.getmValue()];
        for (int i = 0; i < b.getmValue(); i++)
        {
            BitArrayCore.allVals[i] = 0;
        }

    }
}
