package mx.edu.itson.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        var btnAntojitos: Button = findViewById(R.id.button_antojitos) as Button

        btnAntojitos.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        var btnSopas: Button = findViewById(R.id.button_sopas) as Button

        btnSopas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        var btnCombinations: Button = findViewById<Button>(R.id.button_combinations)

        btnCombinations.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        var btnTortas: Button = findViewById<Button>(R.id.button_tortas)

        btnTortas.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        var btnEspecialidades: Button = findViewById<Button>(R.id.button_especialidades )

        btnEspecialidades.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
        var btnDrinks: Button = findViewById<Button>(R.id.button_drinks)

        btnDrinks.setOnClickListener{
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

    }
}