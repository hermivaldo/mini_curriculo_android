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
public class RedesSociaisAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] mValues;

    public RedesSociaisAdapter(Context context, String[] values) {
        super(context, R.layout.lista_de_atividades,values);

        this.context = context;
        this.mValues = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View mView = inflater.inflate(R.layout.lista_de_atividades,parent,false);

        String contatoSocial = String.format(this.context.getResources().getString(R.string.activity),this.mValues[position]);

        TextView mTextView = (TextView) mView.findViewById(R.id.text_activity);
        mTextView.setText(contatoSocial);

        ImageView mImageView = (ImageView) mView.findViewById(R.id.iconActivity);

        switch (position){
            case 0:
                mImageView.setImageResource(R.drawable.ic_google116);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.ic_linkedin11);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.ic_twitter20);
                break;
            default:
                break;
        }

        return mView;
    }
}
