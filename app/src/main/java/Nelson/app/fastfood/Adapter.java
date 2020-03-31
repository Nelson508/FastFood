package Nelson.app.fastfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


import Nelson.app.fastfood.model.Sandwich;

public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<Sandwich> arrayList;

    public Adapter(Context context, ArrayList<Sandwich> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.botones,null);
        }

        TextView nombre = (TextView) convertView.findViewById(R.id.name_sandwich);
        nombre.setText(arrayList.get(position).getNombre());

        return convertView;
    }
}
