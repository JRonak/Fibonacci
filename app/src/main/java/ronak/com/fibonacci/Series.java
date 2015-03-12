package ronak.com.fibonacci;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by ronak on 08-03-2015.
 */
public class Series extends ActionBarActivity {

    Fibonacci fibonacci = new Fibonacci();
    ArrayList<BigInteger> arrayList;
    EditText edittext;
    GridView listView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fibonacci Number Generator");
        edittext = (EditText) findViewById(R.id.editbox_seies);
        listView = (GridView) findViewById(R.id.list_view);
        //LinearLayout linearLayout = (LinearLayout) findViewById(R.id.series_ll);
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //Button click = new Button(this);
        //click.setText("Generate");
        //click.setBackgroundColor(getResources().getColor(R.color.button_bg));
        //linearLayout.addView(click);
    }

    public void generate_series(View v)
    {
        int number;
        try{
            number = Integer.parseInt(edittext.getText().toString());
            edittext.setText("");
            if(number<1&&number>1000000)
            {
                Toast.makeText(this,"Bad number: Number is less than 1",Toast.LENGTH_LONG).show();
            }
        /*else if(number>1000)
        {
            Toast.makeText(this,"Please use number generator for values greater than 1000",Toast.LENGTH_LONG).show();
        }*/
            else
            {
                arrayList = fibonacci.generate_series(number);
                adapter = new Adapter(this,arrayList,number);
                listView.setAdapter(adapter);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toast.makeText(this,"Please enter the Index",Toast.LENGTH_LONG).show();
        }

    }
}
