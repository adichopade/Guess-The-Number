package com.aadi2.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int abc;

    public void guess(View view){

        EditText happy=(EditText)findViewById(R.id.happy);
        int guessInt=Integer.parseInt(happy.getText().toString());
        if(guessInt>abc)
        {
            Toast.makeText(MainActivity.this,"Lower",Toast.LENGTH_SHORT).show();
        }
        else if(guessInt<abc)
        {
            Toast.makeText(MainActivity.this,"Higher",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"That's Right!! Try Again",Toast.LENGTH_SHORT).show();

            Random rand=new Random();
            abc=rand.nextInt(20)+1;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand=new Random();
        abc=rand.nextInt(20)+1;
    }
}
