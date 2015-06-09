package com.curriclo.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.curriclo.app.adapter.ProjetosAdapter;


public class Projetos extends ActionBarActivity {

    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_projetos);
        overridePendingTransition(R.anim.anim,R.anim.close);
        String[] projetos = new String[]{"Segundo lugar na Olimpiada de programação de Guarulhos",
        "Trabalho de Iniciação Científica Monitoramento de Redes com Protocolo SNMP - Autor",
        "Trabalho de Iniciação Científica Rastreador de Veículos Baseado na Plataforma Android - Colaborador",
        "Apresentação de Trabalho De IC em Congresso no IFSP - Campus Birigui",
        "Certificação em VTSP 5.0 VMWARE",
        "Certificação IBM DB2 Academic Associate",
        "Cursos Cisco ICND1, ICND2 e CCNAX"};

        ListView mView = (ListView) findViewById(R.id.atividades_projects);
        mView.setAdapter(new ProjetosAdapter(this,projetos));
    }


}
