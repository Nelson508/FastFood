package Nelson.app.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo Boton Sandwiches
    public void Sandwiches(View view){
        Intent  sandwiches = new Intent(this, SandwichesActivity.class);
        startActivity(sandwiches);
    }
    //Metodo Boton Sobre Nosotros
    public void SobreNosotros(View view){
        Intent  sobrenosotros = new Intent(this, SobreNosotrosActivity.class);
        startActivity(sobrenosotros);
    }

}
