package com.example.passandodadosactivityes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonEnviar=findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class );
                //instanciar o objeto
                Usuario usuario = new Usuario("jamilton","jamiltonDamas@gmail.com");

                //Passar dados
                intent.putExtra("nome", "jamilton");
                intent.putExtra("idade",30);
                intent.putExtra("objeto",  usuario);

                startActivity(intent) ;

            }
        });
    }


}