package dk.itu.smdp.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;


public class MainActivity extends Activity {

    private ArrayList<String> manufacturerList;
    private ArrayList<String> gfxManufacturerList;
    private ArrayList<String> gfxModelNvidiaList,gfxModelAMDList;
    Spinner gfxModelSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        manufacturerList = new ArrayList<String>();
        manufacturerList.add("Select");
        manufacturerList.add("Dell");
        manufacturerList.add("HP");
        manufacturerList.add("Lenovo");

        gfxManufacturerList = new ArrayList<String>();
        gfxManufacturerList.add("Select");
        gfxManufacturerList.add("Nvidia");
        gfxManufacturerList.add("AMD");

        gfxModelNvidiaList = new ArrayList<String>();
        gfxModelAMDList = new ArrayList<String>();
        gfxModelAMDList.add("Radeon 7xxx");
        gfxModelAMDList.add("Radeon 8xxx");
        gfxModelAMDList.add("Radeon R7");
        gfxModelAMDList.add("Radeon R8");
        gfxModelNvidiaList.add("Geforce 5xx");
        gfxModelNvidiaList.add("Geforce 6xx");
        gfxModelNvidiaList.add("Geforce 7xx");


        LayoutParams Params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
        LayoutParams ParamsItem = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);

        LinearLayout priceLayout = new LinearLayout(this);
        priceLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView priceText= new TextView(this);
        priceText.setText("Price");
        priceText.setLayoutParams(ParamsItem);

        EditText minEdit = new EditText(this);
        minEdit.setHint("min");
        minEdit.setLayoutParams(ParamsItem);

        EditText maxEdit = new EditText(this);
        maxEdit.setHint("max");
        maxEdit.setLayoutParams(ParamsItem);

        priceLayout.addView(priceText);
        priceLayout.addView(minEdit);
        priceLayout.addView(maxEdit);


        LinearLayout manufacturerLayout = new LinearLayout(this);
        manufacturerLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView manufacturerText= new TextView(this);
        manufacturerText.setText("Manufacturer");
        manufacturerText.setLayoutParams(ParamsItem);

        Spinner manuSpinner = new Spinner(this);
        manuSpinner.setLayoutParams(ParamsItem);
        manuSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, manufacturerList));

        manufacturerLayout.addView(manufacturerText);
        manufacturerLayout.addView(manuSpinner);

        LinearLayout graphicsLayout = new LinearLayout(this);
        graphicsLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView graphicsText= new TextView(this);
        graphicsText.setText("Graphics");
        graphicsText.setLayoutParams(ParamsItem);

        graphicsLayout.addView(graphicsText);

        LinearLayout gfxMan = new LinearLayout(this);
        gfxMan.setOrientation(LinearLayout.HORIZONTAL);

        TextView gfxText= new TextView(this);
        gfxText.setText("GFx Manufacturer");
        gfxText.setLayoutParams(ParamsItem);


        Spinner gfxManufacturerSpinner = new Spinner(this);
        gfxManufacturerSpinner.setLayoutParams(ParamsItem);
        gfxManufacturerSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, gfxManufacturerList));

        gfxMan.addView(gfxText);
        gfxMan.addView(gfxManufacturerSpinner);

        LinearLayout gfxModel = new LinearLayout(this);
        gfxModel.setOrientation(LinearLayout.HORIZONTAL);

        TextView gfxModelText= new TextView(this);
        gfxModelText.setText("GFx Model");
        gfxModelText.setLayoutParams(ParamsItem);

        final ArrayList defaultItem = new ArrayList<String>();
        defaultItem.add("Select GFx Manufacturer");
        gfxModelSpinner= new Spinner(this);
        gfxModelSpinner.setLayoutParams(ParamsItem);
        gfxModelSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, defaultItem));


        gfxModel.addView(gfxModelText);
        gfxModel.addView(gfxModelSpinner);

//        LinearLayout LL=((LinearLayout) findViewById(R.id.screenL));
        LinearLayout LL = new LinearLayout(MainActivity.this);
        LL.setOrientation(LinearLayout.VERTICAL);
        LL.addView(priceLayout, Params);
        LL.addView(manufacturerLayout,Params);
        LL.addView(graphicsLayout,Params);
        LL.addView(gfxMan,Params);
        LL.addView(gfxModel,Params);

        setContentView(LL, Params);

        gfxManufacturerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();

                if(selected.equals("AMD")){
                    ArrayAdapter<String> n = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, gfxModelAMDList);
                    gfxModelSpinner.setAdapter(n);
                    n.notifyDataSetChanged();
                }
                else if(selected.equals("Nvidia")){
                    ArrayAdapter<String> n = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, gfxModelNvidiaList);
                    gfxModelSpinner.setAdapter(n);
                    n.notifyDataSetChanged();

                }
                else {

                    ArrayAdapter<String> n = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, defaultItem);
                    gfxModelSpinner.setAdapter(n);
                    n.notifyDataSetChanged();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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