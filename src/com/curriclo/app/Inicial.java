package com.curriclo.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.curriclo.app.adapter.AtividadesPrincipaisAdapter;


public class Inicial extends ActionBarActivity implements AdapterView.OnItemClickListener{

    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial_act);

        ListView mList = (ListView) findViewById(R.id.listView);

        mList.setAdapter(new AtividadesPrincipaisAdapter(this, new String[]{"Formação", "Contato",
                "Idiomas", "Projetos e Atividades", "Redes Sociais", "Fontes"}));

        mList.setOnItemClickListener(this);

        overridePendingTransition(R.anim.anim,R.anim.close);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent mIntent = new Intent(this,schools.class);
                startActivity(mIntent);
                break;
            case 1:
                startActivity(new Intent(this,Contatos.class));
                break;
            case 2:
                startActivity(new Intent(this,Linguas.class));
                break;
            case 3:
                startActivity(new Intent(this,Projetos.class));
                break;
            case 4:
                startActivity(new Intent(this,Redes_Sociais.class));
                break;
            case 5:
                startActivity(new Intent(this,Fontes.class));
                break;
            default:
                break;
        }
    }
}
