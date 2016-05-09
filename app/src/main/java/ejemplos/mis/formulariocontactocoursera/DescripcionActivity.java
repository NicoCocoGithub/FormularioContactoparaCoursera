package ejemplos.mis.formulariocontactocoursera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class DescripcionActivity extends AppCompatActivity  implements View.OnClickListener {

    private TextView  nombreCompleto, fechaNacimiento, numeroTelefonico, correoElectronico, descripcionContacto;
    private Button editarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        nombreCompleto = (TextView) findViewById(R.id.textView_nombreCompleto);
        fechaNacimiento = (TextView) findViewById(R.id.textView_fechaDeNacmiento);
        numeroTelefonico =  (TextView) findViewById(R.id.textView_telefono);
        correoElectronico =  (TextView) findViewById(R.id.textView_email);
        descripcionContacto = (TextView) findViewById(R.id.textView_descripcion);









        //Lleno los TextView con la información que me llega de la anterior Actividad
        Intent reciboDatos = getIntent();
        nombreCompleto.setText(reciboDatos.getStringExtra("nombre"));
        fechaNacimiento.setText(reciboDatos.getStringExtra("fecha"));
        correoElectronico.setText(reciboDatos.getStringExtra("email"));
        numeroTelefonico.setText(reciboDatos.getStringExtra("telefono"));
        descripcionContacto.setText(reciboDatos.getStringExtra("descripcion"));




        //Implemento el Botón Volver
        editarDatos = (Button) findViewById(R.id.Button_EditarDatos);
        editarDatos.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Button_EditarDatos:
               /* Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                */
                finish();
                break;
            default:
                break;

        }
    }
}
