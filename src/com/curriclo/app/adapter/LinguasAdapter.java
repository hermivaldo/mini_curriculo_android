package com.curriclo.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.curriclo.app.R;

import java.util.zip.Inflater;

/**
 * Created by hermivaldo on 23/01/15.
 */
public class LinguasAdapter extends ArrayAdapter<String> {

    private final Context mcContext;
    private final String[] mValues;

    public LinguasAdapter(Context context, String[] values) {
        super(context, R.layout.lista_de_atividades, values);

        this.mcContext = context;
        this.mValues = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater mInflater = (LayoutInflater) this.mcContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View mView = mInflater.inflate(R.layout.lista_de_atividades,parent,false);

        String text = String.format(this.mcContext.getResources().getString(R.string.activity),this.mValues[position]);

        TextView mTextView = (TextView) mView.findViewById(R.id.text_activity);
        mTextView.setText(text);

        ImageView mImageView = (ImageView) mView.findViewById(R.id.iconActivity);
        mImageView.setImageResource(R.drawable.ic_businessman209);

        return mView;
    }
}
