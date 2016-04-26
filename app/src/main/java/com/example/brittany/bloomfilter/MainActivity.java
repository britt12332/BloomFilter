package com.example.brittany.bloomfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private EditText inputTF;
    private TextView outputText;
    private Button CheckingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputTF = (EditText)this.findViewById(R.id.inputTF);
        this.outputText = (TextView)this.findViewById(R.id.outputText);
        this.CheckingButton = (Button)this.findViewById(R.id.CheckingButton);


        BitArrayCore.BuildArray();
        BitArray b = new BitArray();
        b.firstHashFunct(4);
        b.secondHashFunct(18);
        b.thirdHashFunct(9);

       System.out.println(Arrays.toString(BitArrayCore.allVals));
        System.out.println(Arrays.toString(BitArrayCore.theSet));





    }

    public void CheckingButtonPressed(View v)
    {

      // b.firstHashFunct(Integer.parseInt(this.inputTF.getText().toString()));
      //  b.secondHashFunct(Integer.parseInt(this.inputTF.getText().toString()));
       // b.thirdHashFunct(Integer.parseInt(this.inputTF.getText().toString()));
        this.outputText.setText(Arrays.toString(BitArrayCore.allVals));
        System.out.println(Arrays.toString(BitArrayCore.theSet));

    }
}