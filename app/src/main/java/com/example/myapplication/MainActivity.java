package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView =findViewById(R.id.gridView);
        String [] pokemonNames= {
                "Bulbasaur","Charmeleon","Squirtle ","Caterpie",
                "Kakuna ","Vaporeon ","Vulpix ","Jigglypuff "
        };
        int [] pokemonImages = {R.drawable._01,R.drawable._05,R.drawable._07,
                R.drawable._10,R.drawable._14,R.drawable._34,R.drawable._37,
                R.drawable._39
        };
        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,pokemonNames,pokemonImages);
        gridView.setAdapter(gridAdapter);

        String [] pokemonAbility={
                "Overgrow","Blaze","Torrent","Shield Dust","Shed Skin",
                "Water Absorb","Flash Fire","Cute Charm-Competitive"
        };
        String [] pokemonCategory ={
                "Seed",
                "Seed",
                "Seed",
                "Lizard",
                "Flame",
                "Flame",
                "Tiny Turtle",
                "Butterfly"
        };
        String [] pokemonHeight={
                "2' 04\"",
                "3' 03\"",
                "6' 07\"",
                "2' 00\"",
                "3' 07\"",
                "5' 07\"",
                "1' 08\"",
                "3' 07\""


        };
        String [] pokemonWeight ={
                "15.2lbs",
                "28.7 lbs",
                "220.5 lbs",
                "18.7 lbs",
                "41.9 lbs",
                "199.5 lbs",
                "19.8 lbs",
                "70.5 lbs"

        };
        String [] pokemonGender ={
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female",
                "Male,Female"
        };
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                MainActivity3.idImage=pokemonImages[position];
                MainActivity3.namePokemon=pokemonNames[position];
                MainActivity3.heightPokemon=pokemonHeight[position];
                MainActivity3.abilityPokemon=pokemonAbility[position];
                MainActivity3.categoryPokemon=pokemonCategory[position];
                MainActivity3.genderPokemon=pokemonGender[position];
                MainActivity3.weightPokemon=pokemonWeight[position];
                Intent intent= new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}