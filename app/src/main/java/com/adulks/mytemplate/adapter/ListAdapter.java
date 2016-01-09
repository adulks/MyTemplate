package com.adulks.mytemplate.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.adulks.mytemplate.R;
import com.adulks.mytemplate.model.ListModel;

import java.util.ArrayList;


public class ListAdapter extends BaseAdapter implements View.OnClickListener {

    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater = null;
    public Resources res;
    ListModel tempValues = null;

    public ListAdapter(Activity a, ArrayList d, Resources resLocal) {

        activity = a;
        data = d;
        res = resLocal;

        inflater = (LayoutInflater) activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    public int getCount() {
        if (data.size() <= 0)
            return 1;
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    public static class ViewHolder {
        //TODO Add Component
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        ViewHolder holder;

        if (convertView == null) {

            vi = inflater.inflate(R.layout.custom_list, null);
            holder = new ViewHolder();

            //TODO Initialize item here

            vi.setTag(holder);
        } else
            holder = (ViewHolder) vi.getTag();

        if (data.size() <= 0) {
            //holder.text.setText("No Data");

        } else {
            tempValues = null;
            tempValues = (ListModel) data.get(position);

            //TODO Add action and properties

             vi.setOnClickListener(new OnItemClickListener(position));

        }
        return vi;
    }

    @Override
    public void onClick(View v) {
        Log.v("CustomAdapter", "=====Row button clicked=====");
    }

    public class OnItemClickListener implements View.OnClickListener {
        private int mPosition;

        OnItemClickListener(int position) {
            mPosition = position;
        }

        @Override
        public void onClick(View arg0) {

        }
    }
}