package com.example.tugas4_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LaguAdapter adapter;
    private ArrayList<Lagu> laguArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new LaguAdapter(laguArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        laguArrayList = new ArrayList<>();
        laguArrayList.add(new Lagu("DJ Dinda dicariin zerzsoftboy","Mengandung musik dari: 'Kita Kita' ","00:26",R.drawable.foto));
        laguArrayList.add(new Lagu("Dj BonBon Remix","Mengandung musik dari: 'Dj Salting' ","00:25",R.drawable.fotoo));
        laguArrayList.add(new Lagu("Apa Kabar Mantan NDX.A.K.A","'Wes.Jeruk_Dek' ","00:33",R.drawable.fotooo));
        laguArrayList.add(new Lagu("yang cakep diposting yang jelek dighosting","Mengandung musik dari: 'Dj Salting' ","00:14",R.drawable.fotoooo));
        laguArrayList.add(new Lagu("Rasa Yang tertinggal Remix","Mengandung musik dari: 'Kita Kita' ","00:18",R.drawable.fotooooo));
        laguArrayList.add(new Lagu("Dinda Cover","Mengandung musik dari: 'pagkain' ","00:41",R.drawable.fotoooooo));
        laguArrayList.add(new Lagu("Only Me Remix","Mengandung musik dari: 'Voltage' ","00:53",R.drawable.fotooooooo));
        laguArrayList.add(new Lagu("DJ PREMINIM Dash Uchiha DJ WISNU UGIL-SAYANGSEKALIi","Mengandung musik dari: 'Voltage' ","00:33",R.drawable.fotoooooooo));
        laguArrayList.add(new Lagu("suara asli - OSKADONE","Mengandung musik dari: 'Toxic' ","00:13",R.drawable.fotooooooooo));
        laguArrayList.add(new Lagu("JEDAG JEDUG KARNA KAMU CEPAK JEDER-tamasonic","Mengandung musik dari: 'Sepine Wengi' ","01:07",R.drawable.fotoooooooooo));
    }
}