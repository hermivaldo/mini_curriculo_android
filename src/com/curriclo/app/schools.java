package com.curriclo.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import com.curriclo.app.adapter.SchoolAdapter;


public class schools extends ActionBarActivity {

    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools);
        overridePendingTransition(R.anim.anim,R.anim.close);

        ListView mListView = (ListView) findViewById(R.id.listView2);
        String[] schools = new String[] {"Instituto Federal de Educação, Ciência e Tecnologia de São Paulo" +
                " Campus Guarulhos\n Manutenção e Suporte à Informática\n 2011 - 2012",
                "Instituto Federal de Educação, Ciência e Tecnologia de São Paulo Campus Guarulhos" +
                        "\n Análise e Desenvolvimento de Sistemas\n 2012 -  Previsão 07/2015 ",
                "Red Zero Guarulhos\n Digital Arts 1.0 (Artes Digitais)\n 2014 - previsão 2017"};
        mListView.setAdapter(new SchoolAdapter(this,schools));

    }


}
