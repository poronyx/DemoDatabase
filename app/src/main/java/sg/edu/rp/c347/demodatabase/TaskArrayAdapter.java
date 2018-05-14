package sg.edu.rp.c347.demodatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TaskArrayAdapter extends ArrayAdapter<Task> {

    ArrayList<Task> al;
    Context context;
    int resource;
    TextView tvID, tvDesc, tvDate;

    public TaskArrayAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        this.context = context;
        this.al = objects;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(resource, parent,false);
        tvID = (TextView) rowView.findViewById(R.id.tvID);
        tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);

        Task data = al.get(position);
        tvID.setText(""+data.getId());
        tvDesc.setText(data.getDescription());
        tvDate.setText(data.getDate());

        return rowView;
    }
}
