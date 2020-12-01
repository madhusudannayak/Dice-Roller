package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random =new Random();
                int a=random.nextInt(6) + 1;

                switch (a){
                    case 1:
                        imageView.setImageResource(R.drawable.dice1);
                        Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.dice2);
                        Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.dice3);
                        Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.dice4);
                        Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.dice5);
                        Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.dice6);
                        Toast.makeText(MainActivity.this,"6",Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });


    }
}