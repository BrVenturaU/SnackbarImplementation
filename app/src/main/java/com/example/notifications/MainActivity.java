package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etNombre, etApellido;
    private Button btnClic;
    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        btnClic = findViewById(R.id.btnClic);
        layout = findViewById(R.id.layout);
        btnClic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        String nombreCompleto = nombre +" "+apellido;
        Toast.makeText(MainActivity.this, nombreCompleto, Toast.LENGTH_SHORT).show();
        Snackbar.make(layout, nombreCompleto, 1000).show();
    }
}