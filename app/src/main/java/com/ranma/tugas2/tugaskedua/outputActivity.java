package com.ranma.tugas2.tugaskedua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class outputActivity extends AppCompatActivity {
    private TextView txtNM;
    private TextView txtAL;
    private TextView txtN;
    private TextView txtNP;
    private TextView txtFK;
    private TextView txtP;
    private Button btnKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        txtNM = (TextView) findViewById(R.id.txtNM);
        txtAL = (TextView) findViewById(R.id.txtAL);
        txtN = (TextView) findViewById(R.id.txtN);
        txtFK = (TextView) findViewById(R.id.txtFK);
        txtP = (TextView) findViewById(R.id.txtP);
        txtNP = (TextView) findViewById(R.id.txtNP);
        btnKembali = (Button) findViewById(R.id.btnKembali);

        String nama = getIntent().getStringExtra("nama");
        String alamat = getIntent().getStringExtra("alamat");
        String no = getIntent().getStringExtra("no");
        String fakultas = getIntent().getStringExtra("fakultas");
        String prodi = getIntent().getStringExtra("prodi");
        String npm = getIntent().getStringExtra("npm");

        txtNM.setText(nama);
        txtAL.setText(alamat);
        txtN.setText(no);
        txtFK.setText(fakultas);
        txtNP.setText(npm);
        txtP.setText(prodi);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(outputActivity.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });
    }
}
