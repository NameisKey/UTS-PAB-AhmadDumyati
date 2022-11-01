package com.example.uts_pab_ahmaddumyati;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvNama, tvNomor, tvJalur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        tvNama = findViewById(R.id.tv_nama);
        tvNomor = findViewById(R.id.tv_no_pendaftaran);
        tvJalur = findViewById(R.id.tv_jalur_pendaftaran);

        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("varNama"));
        tvNomor.setText(intent.getStringExtra("varNomor"));
        tvJalur.setText(intent.getStringExtra("varJalur"));
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}