package Nelson.app.fastfood;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import Nelson.app.fastfood.model.Sandwich;


public class SandwichesActivity extends AppCompatActivity {

    private ListView lista;
    private Adapter adapter;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);
        context = this;

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<Sandwich> model = new ArrayList<>();

        Sandwich s = new Sandwich();

        s.setNombre(R.string.Nombre_Chacarero);
        s.setDescripcion(R.string.Descripcion_Chacarero);
        s.setImagen(R.drawable.chacarero);
        s.setPrecio(R.string.Precio_Chacarero);
        model.add(s);

        s = new Sandwich();

        s.setNombre(R.string.Nombre_Churrasco_Italiano);
        s.setDescripcion(R.string.Descripcion_Churrasco_Italiano);
        s.setImagen(R.drawable.churrascoitaliano);
        s.setPrecio(R.string.Precio_Churrasco_Italiano);
        model.add(s);

        s = new Sandwich();

        s.setNombre(R.string.Nombre_Chemilico);
        s.setDescripcion(R.string.Descripcion_Chemilico);
        s.setImagen(R.drawable.chemilico);
        s.setPrecio(R.string.Precio_Chemilico);
        model.add(s);

        s = new Sandwich();

        s.setNombre(R.string.Nombre_Lomito_Clásico);
        s.setDescripcion(R.string.Descripcion_Lomito_Clásico);
        s.setImagen(R.drawable.lomitoclasico);
        s.setPrecio(R.string.Precio_Lomito_Clásico);
        model.add(s);

        s = new Sandwich();

        s.setNombre(R.string.Nombre_Vegetariano);
        s.setDescripcion(R.string.Descripcion_Vegetariano);
        s.setImagen(R.drawable.vegetariano);
        s.setPrecio(R.string.Precio_Vegetariano);
        model.add(s);

        adapter = new Adapter(this, model);

        lista = (ListView) findViewById(R.id.lv_lista);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              Sandwich   sandwich = (Sandwich) adapter.getItem(position);

              startActivity(DetalleSandwichActivity.getCallingIntent(context, sandwich));
            }
        });
    }




}
