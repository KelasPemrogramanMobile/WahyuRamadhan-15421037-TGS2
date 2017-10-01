package com.ranma.tugas2.tugaskedua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSimpan;
    private EditText txtNama;
    private EditText txtAlamat;
    private EditText txtFak;
    private EditText txtNO;
    private EditText txtNPM;
    private EditText txtPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpan = (Button) findViewById(R.id.btnSimpan);
        txtNama = (EditText) findViewById(R.id.Data);
        txtAlamat = (EditText) findViewById(R.id.txtAlamat);
        txtFak = (EditText) findViewById(R.id.txtFak);
        txtNO = (EditText) findViewById(R.id.txtNO);
        txtNPM = (EditText) findViewById(R.id.txtNPM);
        txtPro = (EditText) findViewById(R.id.txtPro);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = txtNama.getText().toString();
                String alamat = txtAlamat.getText().toString();
                String fakultas = txtFak.getText().toString();
                String no = txtNO.getText().toString();
                String npm = txtNPM.getText().toString();
                String prodi = txtPro.getText().toString();
                if(nama.isEmpty() || alamat.isEmpty() ||fakultas.isEmpty() ||no.isEmpty() ||npm.isEmpty() ||prodi.isEmpty()){
                    Toast.makeText(MainActivity.this, "Data yang kamu isi ada yang kosong tuh..", Toast.LENGTH_LONG).show();
                }else{
                    Intent output = new Intent(MainActivity.this, outputActivity.class);
                    output.putExtra("nama",nama);
                    output.putExtra("alamat",alamat);
                    output.putExtra("fakultas",fakultas);
                    output.putExtra("no",no);
                    output.putExtra("prodi",prodi);
                    output.putExtra("npm",npm);
                    startActivity(output);
                    finish();
                }

            }
        });
    }

}
