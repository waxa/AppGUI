package gui.uva.es.llave.appgui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Llave extends Activity {

    private ImageButton imgRefresh;
    private ImageButton imgLlave;
    private TextView textPoseedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.llave);

        imgRefresh = (ImageButton) findViewById(R.id.imgRefresh);
        imgLlave = (ImageButton) findViewById(R.id.imgLlave);
        textPoseedor = (TextView) findViewById(R.id.textPoseedor);

        imgRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refrescar();
            }
        });
        imgLlave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarLlave();
            }
        });

    }

    private void refrescar (){

    }

    private void cambiarLlave (){

    }

    private void setPoseedor (String poseedor){

        textPoseedor.setText(poseedor);

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_llave, menu);
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
    }*/
}
