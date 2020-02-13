package barreras.mario.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val id1: Button = findViewById(R.id.id1) as  Button
        val id2: Button = findViewById(R.id.id2) as  Button
        val id3: Button = findViewById(R.id.id3) as  Button
        val id4: Button = findViewById(R.id.id4) as  Button
        val id5: Button = findViewById(R.id.id5) as  Button
        val id6: Button = findViewById(R.id.id6) as  Button
        val id7: Button = findViewById(R.id.id7) as  Button
        val id8: Button = findViewById(R.id.id8) as  Button
        val id9: Button = findViewById(R.id.id9) as  Button
        val id0: Button = findViewById(R.id.id0) as  Button
        val idplus: Button = findViewById(R.id.idplus) as  Button
        val idless: Button = findViewById(R.id.idless) as  Button
        val idx: Button = findViewById(R.id.idx) as  Button
        val iddiv: Button = findViewById(R.id.iddiv) as  Button
        val idResult: Button = findViewById(R.id.idResult) as  Button
        val idClear: Button = findViewById(R.id.idClear) as  Button

        val idNumero:TextView= findViewById(R.id.idNumero) as TextView
        val idNumero2:TextView = findViewById(R.id.idNumero2) as TextView


        fun operacion{

            idplus.setOnClickListener {
            }

        }
        var resultado:Int=0


        //numeros
         id1.setOnClickListener {

        }

        id2.setOnClickListener {
        }

        id3.setOnClickListener {
        }

        id4.setOnClickListener {
        }
        id5.setOnClickListener {
        }
        id6.setOnClickListener {
        }
        id7.setOnClickListener {
        }
        id8.setOnClickListener {
        }
        id9.setOnClickListener {
        }
        id0.setOnClickListener {
        }

        //operaciones


        idless.setOnClickListener {
        }

        idx.setOnClickListener {

        }

        iddiv.setOnClickListener {
        }




        //acciones
        idResult.setOnClickListener {
            idNumero.setText(resultado)
        }

        idClear.setOnClickListener {
            idNumero.setText("")
            idNumero2.setText("")
        }



    }
}
