package com.example.nana_permana_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMahasiswa = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> infoMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMahasiswa, namaMahasiswa, infoMahasiswa, kelasMahasiswa, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namaMahasiswa.add("Nana Permana");
        fotoMahasiswa.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRqU0SdPa2dlwBOzvZFP_DUYfSarkJLOxOwZgtq7MoAkXgMqwwK&usqp=CAU" );
        infoMahasiswa.add("Kelas : TI.17.F1");
        kelasMahasiswa.add("Nim : 311720891");

        namaMahasiswa.add("Jerinx");
        fotoMahasiswa.add("https://asset-a.grid.id/crop/0x0:0x0/360x240/photo/haifoto/original/75734_jerinx-sid.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("31");

        namaMahasiswa.add("Vino G Bastian");
        fotoMahasiswa.add("https://cdn.idntimes.com/content-images/community/2019/08/picsart-08-15-081754-de51fbb0fb39b48b3f91678c786a6a6d_600x400.jpg");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("27");

        namaMahasiswa.add("Chesster Benington");
        fotoMahasiswa.add("https://awsimages.detik.net.id/community/media/visual/2017/07/21/5b945349-869c-416f-92e6-a6af73d5cca6.jpg?w=900&q=70");
        infoMahasiswa.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        kelasMahasiswa.add("26");



        prosesRecyclerViewAdapter();

    }
}
