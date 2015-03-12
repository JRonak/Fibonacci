package ronak.com.fibonacci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by ronak on 08-03-2015.
 */
public class Adapter extends ArrayAdapter {

    Context context;
    int upto,i;
    ArrayList<BigInteger> arrayList;

    public Adapter(Context context, ArrayList<BigInteger> arrayAdapter,int resource) {
        super(context, resource,arrayAdapter);
        this.context=context;
        this.upto=resource;
        this.arrayList=arrayAdapter;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView!=null)
        {
            view=convertView;
        }
        else
        {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.listview,parent,false);
        }
        TextView index,length,number;
        index = (TextView) view.findViewById(R.id.list_tv);
        length = (TextView) view.findViewById(R.id.list_length);
        number =(TextView) view.findViewById(R.id.list_number);
        String num = arrayList.get(position).toString();
        i=position+1;
        index.setText("Index: "+i);
        length.setText("Length: "+num.length());
        number.setText(num);
        return view;
    }
}
