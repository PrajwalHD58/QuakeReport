package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /*
    create a new earthquakeadpter
    Context to the app;
    List of earthquakes
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes)
    {
        super(context,0,earthquakes);
    }

    //retuns the list item view to display information correctly
    @Override
    public View getView(int position , View convertView , ViewGroup parent)
    {
        /*
        >Check whether there is existing listview/convertview to reuse,else create/inflate new listView
         */
        View listitemView=convertView;
        if(listitemView==null)
        {
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent ,false);
        }

        //find the Earthquake at given position int the list of earthquakes
        Earthquake current=getItem(position);

        //Find the textview eith the id
        TextView scale=(TextView) listitemView.findViewById(R.id.text1);
        TextView city=(TextView) listitemView.findViewById(R.id.text2);
        TextView time=(TextView) listitemView.findViewById(R.id.text3);

        //Display the current view
        scale.setText(current.getScale());
        city.setText(current.getCity());
        time.setText(current.getTime());

        return listitemView;
    }

}
