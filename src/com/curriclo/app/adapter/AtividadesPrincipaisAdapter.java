package com.curriclo.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.curriclo.app.R;

/**
 * Created by hermivaldo on 23/01/15.
 */
public class AtividadesPrincipaisAdapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final String[] values;

    public AtividadesPrincipaisAdapter(Context context, String[] values) {
        super(context, R.layout.lista_de_atividades, values);
        this.mContext = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = mInflater.inflate(R.layout.lista_de_atividades,parent,false);

        String atividade = String.format(mContext.getResources().getString(R.string.activity),values[position]);

        TextView mText = (TextView) rowView.findViewById(R.id.text_activity);
        mText.setText(atividade);
        ImageView mImageView = (ImageView) rowView.findViewById(R.id.iconActivity);
        switch (position){
            case 0:
                mImageView.setImageResource(R.drawable.ic_school);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.ic_cellphone);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.ic_english);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.ic_businessman3);
                break;
            case 4:
                mImageView.setImageResource(R.drawable.ic_online5);
                break;
            case 5:
                mImageView.setImageResource(R.drawable.ic_copyright2);
                break;
            default:
                break;
        }



        return rowView;
    }
}
