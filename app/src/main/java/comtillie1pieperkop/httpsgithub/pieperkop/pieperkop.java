package comtillie1pieperkop.httpsgithub.pieperkop;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class pieperkop extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pieperkop);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pieperkop, menu);
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

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox_hoed:
                ImageView imgHoed = (ImageView) findViewById(R.id.hoed);
                if (checked) {
                    // make hoed visible
                    imgHoed.setVisibility(View.VISIBLE);
                    ///((CheckBox) view).
                } else {
                    // Remove hoed
                    imgHoed.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_wbrouwen:
                ImageView imgWbrouwen = (ImageView) findViewById(R.id.wenkbrouwen);
                if (checked) {
                    // make wenkbrouwen visible
                    imgWbrouwen.setVisibility(View.VISIBLE);
                } else {
                    // Remove wenkbrouwen
                    imgWbrouwen.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_neus:
                ImageView imgNeus = (ImageView) findViewById(R.id.neus);
                if (checked) {
                    // make neus visible
                    imgNeus.setVisibility(View.VISIBLE);
                } else {
                    // Remove neus
                    imgNeus.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_snor:
                ImageView imgSnor = (ImageView) findViewById(R.id.snor);
                if (checked) {
                    // make snor visible
                    imgSnor.setVisibility(View.VISIBLE);
                } else {
                    // Remove snor
                    imgSnor.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_armen:
                ImageView imgArmen = (ImageView) findViewById(R.id.armen);
                if (checked) {
                    // make armen visible
                    imgArmen.setVisibility(View.VISIBLE);
                } else {
                    // Remove armen
                    imgArmen.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_ogen:
                ImageView imgOgen = (ImageView) findViewById(R.id.ogen);
                if (checked) {
                    // make ogen visible
                    imgOgen.setVisibility(View.VISIBLE);
                } else {
                    // Remove ogen
                    imgOgen.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_bril:
                ImageView imgBril = (ImageView) findViewById(R.id.bril);
                if (checked) {
                    // make bril visible
                    imgBril.setVisibility(View.VISIBLE);
                } else {
                    // Remove bril
                    imgBril.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_mond:
                ImageView imgMond = (ImageView) findViewById(R.id.mond);
                if (checked) {
                    // make mond visible
                    imgMond.setVisibility(View.VISIBLE);
                } else {
                    // Remove mond
                    imgMond.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_oren:
                ImageView imgOren = (ImageView) findViewById(R.id.oren);
                if (checked) {
                    // make oren visible
                    imgOren.setVisibility(View.VISIBLE);
                } else {
                    // Remove oren
                    imgOren.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_voeten:
                ImageView imgVoeten = (ImageView) findViewById(R.id.voeten);
                if (checked) {
                    // make voeten visible
                    imgVoeten.setVisibility(View.VISIBLE);
                } else {
                    // Remove voeten
                    imgVoeten.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
