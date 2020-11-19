package com.example.kino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    Spinner spin2;
    ListView list;

    String[] comedies;
    ArrayAdapter<String> adapterComedies;

    String[] drama;
    ArrayAdapter<String> adapterDramas;

    String[] war;
    ArrayAdapter<String> adapterWars;

    String[] detective;
    ArrayAdapter<String> adapterDetectives;

    String[] adventure;
    ArrayAdapter<String> adapterAdventures;

    String[] none;
    ArrayAdapter<String> adapterNone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = findViewById(R.id.spinner);
        spin2 = findViewById(R.id.spinner2);
        list = findViewById(R.id.listView);

        none = getResources().getStringArray(R.array.none);
        adapterNone = new ArrayAdapter(this,android.R.layout.simple_list_item_1, none);

        comedies = getResources().getStringArray(R.array.comedy);
        adapterComedies = new ArrayAdapter(this,android.R.layout.simple_list_item_1, comedies);

        drama = getResources().getStringArray(R.array.drama);
        adapterDramas = new ArrayAdapter(this,android.R.layout.simple_list_item_1, drama);

        war = getResources().getStringArray(R.array.war);
        adapterWars = new ArrayAdapter(this,android.R.layout.simple_list_item_1, war);

        detective = getResources().getStringArray(R.array.detective);
        adapterDetectives = new ArrayAdapter(this,android.R.layout.simple_list_item_1, detective);

        adventure = getResources().getStringArray(R.array.adventure);
        adapterAdventures = new ArrayAdapter(this,android.R.layout.simple_list_item_1, adventure);
    }

    public void showList(View v){
        String s = spin.getSelectedItem().toString();
        String ss = spin2.getSelectedItem().toString();

        if (ss.equals("Отечественное")){
            if (s.equals("Комедия")){
                list.setAdapter(adapterComedies);
            }
            else if (s.equals("Мелодрама")){
                list.setAdapter(adapterDramas);
            }
            else if (s.equals("Боевик")){
                list.setAdapter(adapterWars);
            }
            else if (s.equals("Детектив")){
                list.setAdapter(adapterDetectives);
            }
            else if (s.equals("Приключения")){
                list.setAdapter(adapterAdventures);
            }
        }
        else if (ss.equals("Зарубежное")){
            list.setAdapter(adapterNone);
        }
    }
}