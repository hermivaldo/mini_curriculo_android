package com.curriclo.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.curriclo.app.adapter.RedesSociaisAdapter;


public class Redes_Sociais extends ActionBarActivity implements AdapterView.OnItemClickListener{

    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes__sociais);
        overridePendingTransition(R.anim.anim,R.anim.close);
        String[] social = new  String[]{"Google PLus: +HermivaldoBragaOliveiraJúnior",
        "LinkedIn: Hermivaldo Júnior (Perfil temporáriamente sem Foto)",
        "Twitter: HermivaldoB"};
        ListView mListView = (ListView) findViewById(R.id.lista_redes_soc);
        mListView.setAdapter(new RedesSociaisAdapter(this,social));
        mListView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://plus.google.com/u/0/+HermivaldoBragaOliveiraJúnior/posts"));
                startActivity(i);
                break;
            case 1:
                Intent l = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://br.linkedin.com/pub/hermivaldo-braga-oli-braga/77/33a/649"));
                startActivity(l);
                break;
            case 2:
                Intent t = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/HermivaldoB"));
                startActivity(t);


        }
    }
}
