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
public class ContatosAdapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final String[] mString;

    public ContatosAdapter(Context context, String[] values) {
        super(context, R.layout.lista_de_atividades,values);

        this.mContext = context;
        this.mString = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mLayoutInflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View mView = mLayoutInflater.inflate(R.layout.lista_de_atividades, parent,false);

        String contato = String.format(this.mContext.getResources().getString(R.string.activity), this.mString[position]);

        TextView mTextView = (TextView) mView.findViewById(R.id.text_activity);
        mTextView.setText(contato);

        ImageView mImageView = (ImageView) mView.findViewById(R.id.iconActivity);

        switch (position){
            case 0:
                mImageView.setImageResource(R.drawable.ic_smartphone);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.ic_phone16);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.ic_mail9);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.ic_mail9);
                break;
            default:
                break;
        }



        return mView;
    }
}
