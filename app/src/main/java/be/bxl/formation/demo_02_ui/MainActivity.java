package be.bxl.formation.demo_02_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Type "...View" permet d'interagir avec les Vues du layout.
    private TextView tvDemo;
    private Button btnDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtenir un element à l'aide de la vue
        tvDemo = findViewById(R.id.tv_main_demo);
        btnDemo = findViewById(R.id.btn_main_demo);

        // Modifier la valeur d'un TextView
        tvDemo.setText("Texte modifié dans le code!");

        // Ajouter l'evenement sur le bouton
        btnDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}