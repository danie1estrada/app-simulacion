package com.example.acer.simulacin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Aleatorio aleatorio;
    private RadioGroup rbGroup;
    private RadioButton rbtnMixto;
    private RadioButton rbtnMulti;
    private Button btnCalcular;
    private EditText txtSemilla;
    private EditText txtConstAditiva;
    private EditText txtConstMulti;
    private EditText txtModulo;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rbtnMixto = (RadioButton) findViewById(R.id.rbtnMixto);
        rbtnMulti = (RadioButton) findViewById(R.id.rbtnMulti);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtSemilla = (EditText) findViewById(R.id.txtSemilla);
        txtConstAditiva = (EditText) findViewById(R.id.txtConstAditiva);
        txtConstMulti = (EditText) findViewById(R.id.txtConstMultip);
        txtModulo = (EditText) findViewById(R.id.txtModulo);
        lblResultado = (TextView) findViewById(R.id.lblResultado);

        aleatorio = new Aleatorio();
    }

    public void calcular(View v) {
        double x = Double.parseDouble(txtSemilla.getText().toString());
        double a = Double.parseDouble(txtConstMulti.getText().toString());
        double c = Double.parseDouble(txtConstAditiva.getText().toString());
        double m = Double.parseDouble(txtModulo.getText().toString());

        switch (rbGroup.getCheckedRadioButtonId()) {
            case R.id.rbtnMixto:
                lblResultado.setText(Double.toString(aleatorio.mixto(x, a, c, m)));
                break;
            case R.id.rbtnMulti: break;
        }
    }
}
