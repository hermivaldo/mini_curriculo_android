package com.curriclo.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.curriclo.app.adapter.ContatosAdapter;


public class Contatos extends ActionBarActivity implements AdapterView.OnItemClickListener{

    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
        ListView mListView = (ListView) findViewById(R.id.list_contato);
        overridePendingTransition(R.anim.anim,R.anim.close);
        String[] mValues = new String[]{"Cel:(11) 95578-1007","Casa: (11) 2411-2139",
        "email: hermivaldo.braga@gmail.com","email: hermivaldo@bsd.com.br"};

        mListView.setAdapter(new ContatosAdapter(this,mValues));
        mListView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                String number = "tel:945183960";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(number)));
                break;
            case 1:
                String num = "tel:24112139";
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(num)));
                break;
            case 3:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:hermivaldo.braga@gmail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email Subject");

                startActivity(Intent.createChooser(emailIntent, "Contato com Hermivaldo"));
                break;
            case 4:
                Intent email = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:hermivaldo@bsd.com"));
                email.putExtra(Intent.EXTRA_SUBJECT, "Email Subject");

                startActivity(Intent.createChooser(email, "Contato com Hermivaldo"));
                break;
        }
    }
}
