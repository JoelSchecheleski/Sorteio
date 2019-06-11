package com.uppertools.sorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Altera o valor de texto gerado
     * @param view
     */
    public void alterarValor(View view) {
        TextView text = findViewById(R.id.txtResultado);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            int x = new Random().nextInt(60);
            if (x == 0) {
                int y = new Random().nextInt(60);
                list.add("" + y);
            } else {
                list.add("" + x);
            }
        }

        text.setText("" + list);
    }
}
