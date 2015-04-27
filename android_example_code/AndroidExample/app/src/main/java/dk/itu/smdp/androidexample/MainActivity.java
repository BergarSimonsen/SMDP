package dk.itu.smdp.androidexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ArrayList<String> manufacturerList;
    private ArrayList<String> gfxManufacturerList;
    private ArrayList<String> gfxModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manufacturerList = new ArrayList<String>();
        manufacturerList.add("Dell");
        manufacturerList.add("HP");
        manufacturerList.add("Lenovo");


        gfxManufacturerList = new ArrayList<String>();
        gfxManufacturerList.add("Nvidia");
        gfxManufacturerList.add("AMD");

        gfxModelList = new ArrayList<String>();
        gfxModelList.add("Radeon 7xxx");
        gfxModelList.add("Radeon 8xxx");
        gfxModelList.add("Radeon R7");
        gfxModelList.add("Radeon R8");
        gfxModelList.add("Geforce 5xx");
        gfxModelList.add("Geforce 6xx");
        gfxModelList.add("Geforce 7xx");



        Spinner manuSpinner = (Spinner) findViewById(R.id.manufacturer_spinner);
        manuSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, manufacturerList));
        Spinner gfxManufacturerSpinner = (Spinner) findViewById(R.id.gfx_manufacturer_spinner);
        gfxManufacturerSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, gfxManufacturerList));
        Spinner gfxModelSpinner = (Spinner) findViewById(R.id.gfx_model_spinner);
        gfxModelSpinner.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, gfxModelList));

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
