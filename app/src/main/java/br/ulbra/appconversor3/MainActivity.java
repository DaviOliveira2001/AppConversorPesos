package br.ulbra.appconversor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtQuilos, edtLibras;

    Button btnConverter;
    TextView txtResultado;
    double v1, v2, calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtQuilos = (EditText) findViewById(R.id.edtKg);
        edtLibras = (EditText) findViewById(R.id.edlLib);
        btnConverter = (Button) findViewById(R.id.btnConv);
        txtResultado = (TextView) findViewById(R.id.txtResposta);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtQuilos.getText().toString().equals("")){
                    v2 = Double.parseDouble(edtLibras.getText().toString());
                    calculo = v2 / 2.20462;
                    txtResultado.setText(v2+" libras em quilos é "+calculo);
                }else{
                    v1 = Double.parseDouble(edtQuilos.getText().toString());
                    calculo = v1 * 2.20462;
                    txtResultado.setText(v1+" quilos em libras é "+calculo);
                }
            }
        });
    }
}