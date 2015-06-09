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
public class ProjetosAdapter extends ArrayAdapter<String> {

    private final Context mContext;
    private final String[] mValues;

    public ProjetosAdapter(Context context, String[] values) {
        super(context, R.layout.lista_de_atividades, values);
        this.mContext = context;
        this.mValues = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View mView = inflater.inflate(R.layout.lista_de_atividades,parent,false);

        String atividade = String.format(this.mContext.getResources().getString(R.string.activity),this.mValues[position]);

        TextView mTextView = (TextView) mView.findViewById(R.id.text_activity);
        mTextView.setText(atividade);

        ImageView mImageView = (ImageView) mView.findViewById(R.id.iconActivity);

        switch (position){
            case 0:
                mImageView.setImageResource(R.drawable.ic_medal16);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.ic_quill5);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.ic_quill5);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.ic_classroom);
                break;
            default:
                mImageView.setImageResource(R.drawable.ic_man216);
                break;
        }

        return mView;
    }
}
