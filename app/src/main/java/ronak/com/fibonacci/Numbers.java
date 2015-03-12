package ronak.com.fibonacci;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;

/**
 * Created by ronak on 08-03-2015.
 */
public class Numbers extends ActionBarActivity {
    EditText editText;
    TextView textView,textView1;
    Fibonacci fibonacci;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fibonacci Number");
        editText = (EditText) findViewById(R.id.edittext_number);
        textView = (TextView) findViewById(R.id.tv_number);
        textView1 = (TextView) findViewById(R.id.counter);
        fibonacci = new Fibonacci();
    }

    public void generate_num(View v)
    {
        int i;
        try{
            i = Integer.parseInt(editText.getText().toString());
            editText.setText("");
            if(i<1||i>1000000)
            {
                Toast.makeText(this, "Bad number", Toast.LENGTH_LONG).show();
            }
            else
            {

                String s = fibonacci.generate_number(i);
                textView1.setText("Index: "+i+"\t Length: "+s.length());
                textView.setText(s);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toast.makeText(this,"Bad number",Toast.LENGTH_LONG).show();
        }
    }
}
