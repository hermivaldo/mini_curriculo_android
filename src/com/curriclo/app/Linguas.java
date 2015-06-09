package com.curriclo.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.curriclo.app.adapter.LinguasAdapter;


public class Linguas extends ActionBarActivity {

    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linguas);
        overridePendingTransition(R.anim.anim,R.anim.close);
        String[] idiomas = new String[]{"Inglês Intermediário para leitura e conversação",
                "Francês básico"};

        ListView mListView = (ListView) findViewById(R.id.lista_linguas);

        mListView.setAdapter(new LinguasAdapter(this,idiomas));
    }


}
