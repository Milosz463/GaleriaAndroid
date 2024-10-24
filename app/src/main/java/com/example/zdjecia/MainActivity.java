package com.example.zdjecia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer>obrazki=new ArrayList<>();
    Button buttonPrev;
    Button buttonNext;
    ImageView imageView;
    int idObrazka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obrazki.add(R.drawable.butterfly);
        obrazki.add(R.drawable.butterfly2);
        obrazki.add(R.drawable.butterfly3);
        obrazki.add(R.drawable.butterfly4);
        obrazki.add(R.drawable.insect5);

        imageView=findViewById(R.id.imageView);

        buttonNext=findViewById(R.id.button2);
        buttonNext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    idObrazka++;
                        if(idObrazka==obrazki.size()){
                            idObrazka=0;
                        }
                    imageView.setImageResource(obrazki.get(idObrazka));

                    }
                }
        );

        buttonPrev=findViewById(R.id.button);
        buttonPrev.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    idObrazka--;
                        if(idObrazka<0){
                           idObrazka= obrazki.size()-1;
                        }
                    imageView.setImageResource(obrazki.get(idObrazka));

                    }
                }
        );
    }


}