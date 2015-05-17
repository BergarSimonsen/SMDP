package dk.itu.smdp.clothesconfigurator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.LinearLayout.*;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class ClothesConfigurator extends ActionBarActivity {

    private Spinner ShirtColorSpinner;
    private Spinner ShirtSizeSpinner;

    private EditText PrintColorEditText;
    private EditText PrintShapeEditText;

    private void checkConstraints() {
//        if(ShirtColor.equals(Color)) {
//            // some sort of error/invalidation
//        }
//        if(!(!ShirtColor.equals("RED") || (ShirtColor.equals("RED") && ShirtSize > 3))) {
//            // invalidate
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_clothes_configurator);

//        private String ShirtColor;
//        private int ShirtSize;
//        private Parameter ShirtColor;



//        class Print {
//            static String Color;
//            static String Shape;
//        }





        LayoutParams Params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        LayoutParams ParamsItem = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        LayoutParams ParamsChild = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        ParamsChild.setMargins(20, 0, 0, 0);

        LinearLayout ShirtColorLinearLayout = new LinearLayout(this);
        ShirtColorLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView ShirtColorTextView = new TextView(this);
        ShirtColorTextView.setText("ShirtColor");
        ShirtColorTextView.setLayoutParams(ParamsItem);

        ShirtColorSpinner = new Spinner(this);
        ShirtColorSpinner.setLayoutParams(ParamsItem);
        ShirtColorSpinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new ArrayList<String>(Arrays.asList("RED", "BLACK", "BLUE"))));
        ShirtColorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkConstraints();
                String i = parent.getAdapter().getItem(position).toString();
                Toast.makeText(ClothesConfigurator.this, "selected color: " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ShirtColorLinearLayout.addView(ShirtColorTextView);
        ShirtColorLinearLayout.addView(ShirtColorSpinner);

        LinearLayout ShirtSizeLinearLayout = new LinearLayout(this);
        ShirtSizeLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView ShirtSizeTextView = new TextView(this);
        ShirtSizeTextView.setText("ShirtSize");
        ShirtSizeTextView.setLayoutParams(ParamsItem);

        ShirtSizeSpinner = new Spinner(this);
        ShirtSizeSpinner.setLayoutParams(ParamsItem);
        ShirtSizeSpinner.setAdapter(new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))));
        ShirtSizeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkConstraints();
                int i = (int) parent.getAdapter().getItem(position);
                Toast.makeText(ClothesConfigurator.this, "selected size: " + i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ShirtSizeLinearLayout.addView(ShirtSizeTextView);
        ShirtSizeLinearLayout.addView(ShirtSizeSpinner);

        TextView PrintTextView = new TextView(this);
        PrintTextView.setText("Print");

        View separator = new View(this);
        separator.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, 1));


        LinearLayout PrintColorLinearLayout = new LinearLayout(this);
        PrintColorLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView PrintColorTextView = new TextView(this);
        PrintColorTextView.setText("Print Color");
        PrintColorTextView.setLayoutParams(ParamsChild);

        PrintColorEditText = new EditText(this);
        PrintColorEditText.setHint("Print Color");
        PrintColorEditText.setLayoutParams(ParamsChild);

        PrintColorLinearLayout.addView(PrintColorTextView);
        PrintColorLinearLayout.addView(PrintColorEditText);

        LinearLayout PrintShapeLinearLayout = new LinearLayout(this);
        PrintShapeLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView PrintShapeTextView = new TextView(this);
        PrintShapeTextView.setText("Print Shape");
        PrintShapeTextView.setLayoutParams(ParamsChild);

        PrintShapeEditText = new EditText(this);
        PrintShapeEditText.setHint("Print Shape");
        PrintShapeEditText.setLayoutParams(ParamsChild);

        PrintShapeLinearLayout.addView(PrintShapeTextView);
        PrintShapeLinearLayout.addView(PrintShapeEditText);


//        LinearLayout LL=((LinearLayout) findViewById(R.id.screenL));
        LinearLayout LL = new LinearLayout(this);
        LL.setOrientation(LinearLayout.VERTICAL);
        LL.addView(ShirtColorLinearLayout, Params);
        LL.addView(ShirtSizeLinearLayout,Params);
        LL.addView(PrintTextView);
        LL.addView(separator);
        LL.addView(PrintColorLinearLayout,Params);
        LL.addView(PrintShapeLinearLayout,Params);

        setContentView(LL, Params);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_clothes_configurator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
