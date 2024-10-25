package es.travelworld.www.login3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import es.travelworld.www.login3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    TextInputEditText login;
    TextInputEditText password;
    Button btLogin, btGetNew, btCreateNew;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        DataBindingUtil.setContentView(this,R.layout.activity_main);
        Usuario usuario=new Usuario(login,password).binding.setUser(Usuario);



        binding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textLogin.getText().toString();
                binding.textPassword.getText().toString();

            }

        });

        binding.btCreateNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Pronto se implementaran estas funciones".toString(), Snackbar.LENGTH_LONG).show();

            }
        });
        binding.btGetNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Pronto se implementaran estas funciones".toString(), Snackbar.LENGTH_LONG).show();

            }
        });
        



    }


}
    /*    private void recuperarDatos(){
        login=((TextInputEditText) findViewById(R.id.textLogin));
        password=((TextInputEditText) findViewById(R.id.textPassword));
        btLogin=((Button) findViewById(R.id.btLogin));
        btCreateNew=((Button) findViewById(R.id.btCreateNew));
        btGetNew=((Button) findViewById(R.id.btGetNew));
    }*/

