package ejemplos.mis.formulariocontactocoursera;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    private DatePicker fechaCumpleanios; // fecha de Cumpleaños
    private Button botonSiguiente;
    private EditText nombreCompleto, numeroTelefonico, correoElectronico, descripcionContacto;
    private TextInputLayout tilNombreCompleto,tilNumeroTelefonico, tilCorreoElectronico, tilDescripcionContacto;

    private static final int VACIO = 0; //para no cometer el error de llevar a la segunda actividad vacio o almenos avisando




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fechaCumpleanios = (DatePicker) findViewById(R.id.DatePicker_cumpleanios);
        botonSiguiente = (Button) findViewById(R.id.Button_Siguiente);

        nombreCompleto = (EditText) findViewById(R.id.EditText_nombreCompleto);
        numeroTelefonico = (EditText) findViewById(R.id.EditText_numeroTelefonico);
        correoElectronico = (EditText) findViewById(R.id.EditText_correoElectronico);
        descripcionContacto = (EditText) findViewById(R.id.EditText_descripcionContacto);




        tilNombreCompleto = (TextInputLayout) findViewById(R.id.TextInputLayout_nombreCompleto);
        tilNumeroTelefonico = (TextInputLayout) findViewById(R.id.TextInputLayout_numeroTelefonico);
        tilCorreoElectronico = (TextInputLayout) findViewById(R.id.TextInputLayout_correoElectronico);
        tilDescripcionContacto = (TextInputLayout) findViewById(R.id.TextInputLayout_descripcionContacto);


        //habilito los mensajes de error en los TiL
        tilNombreCompleto.setErrorEnabled(true);
        tilNumeroTelefonico.setErrorEnabled(true);
        tilCorreoElectronico.setErrorEnabled(true);


        botonSiguiente.setOnClickListener(this);
        tilNumeroTelefonico.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Button_Siguiente:








               //Almacenamos la fecha
                int dia = fechaCumpleanios.getDayOfMonth();
                int mes = fechaCumpleanios.getMonth();
                int anio = fechaCumpleanios.getYear();
                     //Averiguamos si El nombre esta Vacio



                // vamos a cargar los dato para enviarlo por el Intent

                String nombre_,fechaDeNacimiento_, telefono_, email_, descripcion_;

                nombre_ = nombreCompleto.getText().toString();

                fechaDeNacimiento_ = String.valueOf(dia+"/"+mes+"/"+anio);

                telefono_ = numeroTelefonico.getText().toString();

                email_ = correoElectronico.getText().toString();

                descripcion_ = descripcionContacto.getText().toString();

              //  Contacto contacto = new Contacto(nombre_,fechaDeNacimiento_, telefono_, email_, descripcion_);



                Intent envioDatos= new Intent(this,DescripcionActivity.class);
                envioDatos.putExtra("nombre", nombre_);
                envioDatos.putExtra("fecha", fechaDeNacimiento_);
                envioDatos.putExtra("telefono",telefono_);
                envioDatos.putExtra("email",email_);
                envioDatos.putExtra("descripcion",descripcion_);
                startActivity(envioDatos);

                break;

            default:
                break;
        }
    }


}
