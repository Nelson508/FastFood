package Nelson.app.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import Nelson.app.fastfood.model.Sandwich;

public class DetalleSandwichActivity extends AppCompatActivity {

    private TextView sNombre, sDescripcion, sPrecio;
    private ImageView sImagen;
    private Sandwich sandwich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_sandwich);

        try {
            sandwich = (Sandwich) getIntent().getExtras().getSerializable("model");
        }catch (Exception e){
            finish();
        }

        String z = getString(R.string.Detalles);
        String x = getString(sandwich.getNombre());

        getSupportActionBar().setTitle(z+" "+x);

        sImagen = (ImageView) findViewById(R.id.s_imagen);
        sNombre = (TextView) findViewById(R.id.s_nombre);
        sDescripcion = (TextView) findViewById(R.id.s_descripcion);
        sPrecio = (TextView) findViewById(R.id.s_precio);

        sImagen.setImageResource(sandwich.getImagen());
        sNombre.setText(sandwich.getNombre());
        sDescripcion.setText(sandwich.getDescripcion());
        sPrecio.setText(sandwich.getPrecio());
    }

    public static Intent getCallingIntent(Context context, Sandwich sandwich){
        Intent intent = new Intent(context, DetalleSandwichActivity.class);
        intent.putExtra("model", sandwich);
        return intent;

    }
}
