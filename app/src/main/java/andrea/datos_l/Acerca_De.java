package andrea.datos_l;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Acerca_De extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca__de);
    }
    public void regresar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
