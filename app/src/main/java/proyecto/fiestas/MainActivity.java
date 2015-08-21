package proyecto.fiestas;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //localizamos el boton en la vista
        final Button botonRegistro = (Button)findViewById(R.id.boton_registro_main);
        final Button botonLogin = (Button)findViewById(R.id.boton_login_main);

        //creamos los listener de los botones
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                registro();
            }
        });

        botonLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login();
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }

    //funcion que contola el login
    public void login(){
        //Declaramos variables de la funcion
        final EditText usuarioEditText = (EditText)findViewById(R.id.usuario_login);
        final EditText passwordEditText = (EditText)findViewById(R.id.password_login);
        //llamamos a la vista para mostrar el login
        setContentView(R.layout.login);
        //Localizamos boton para enviar al servidor usuario y contraseña
        final Button botonLogin = (Button)findViewById(R.id.boton_login);
        //creamos los listener de los botones
        botonLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String usuario = usuarioEditText.getText().toString();
                String password = passwordEditText.getText().toString();
            }
        });
    }

    //funcion que controla el registro
    public void registro(){
        //Declaramos variable de la funcion
        final EditText usuarioEditText = (EditText)findViewById(R.id.usuario_registro);
        final EditText passwordEditText = (EditText)findViewById(R.id.password_registro);
        final EditText nombreEditText = (EditText)findViewById(R.id.nombre_registro);
        final EditText apellidosEditText = (EditText)findViewById(R.id.apellidos_registro);
        //llamamos a la vista para mostrar el login
        setContentView(R.layout.registro);
        //Localizamos boton para enviar los datos al servidor y realizar el registro
        final Button botonRegistro = (Button)findViewById(R.id.boton_registro);
        //creamos los listener de los botones
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String usuario = usuarioEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String nombre = nombreEditText.getText().toString();
                String apellidos = apellidosEditText.getText().toString();
            }
        });
    }
}
