package com.calculadora_online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button numero_0,numero_1,numero_2,numero_3,numero_4,numero_5,numero_6,numero_7,numero_8,numero_9,ponto,soma,subtracao,multiplicacao,
            divisao,igual,botao_limpar;

    private TextView txtEmpressao,txtResultado;

    private ImageView backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();
        getSupportActionBar().hide();

        numero_0.setOnClickListener(this);
        numero_1.setOnClickListener(this);
        numero_2.setOnClickListener(this);
        numero_3.setOnClickListener(this);
        numero_4.setOnClickListener(this);
        numero_5.setOnClickListener(this);
        numero_6.setOnClickListener(this);
        numero_7.setOnClickListener(this);
        numero_8.setOnClickListener(this);
        numero_9.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        divisao.setOnClickListener(this);

        botao_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               txtEmpressao.setText("");
               txtResultado.setText("");
            }
        });
    }

    private void IniciarComponentes(){
        numero_0 = findViewById(R.id.numero_0);
        numero_1 = findViewById(R.id.numero_1);
        numero_2 = findViewById(R.id.numero_2);
        numero_3 = findViewById(R.id.numero_3);
        numero_4 = findViewById(R.id.numero_4);
        numero_5 = findViewById(R.id.numero_5);
        numero_6 = findViewById(R.id.numero_6);
        numero_7 = findViewById(R.id.numero_7);
        numero_8 = findViewById(R.id.numero_8);
        numero_9 = findViewById(R.id.numero_9);
        ponto = findViewById(R.id.ponto);
        soma = findViewById(R.id.soma);
        subtracao = findViewById(R.id.subtracao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.bt_divisao);
        igual = findViewById(R.id.igual);
        botao_limpar = findViewById(R.id.bt_limpar);
        txtEmpressao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
        backspace = findViewById(R.id.backspace);

    }

    public void AcrescentarUmaExpressao(String string,boolean limpar_dados){

        if (txtResultado.getText().equals("")){
            txtEmpressao.setText("");
        }

        if (limpar_dados){
            txtResultado.setText("");
            txtEmpressao.append(string);
        }else{
            txtEmpressao.append(txtResultado.getText());
            txtEmpressao.append(string);
            txtResultado.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_0:
                AcrescentarUmaExpressao("0", true);
                break;

            case R.id.numero_1:
                AcrescentarUmaExpressao("1", true);
                break;

            case R.id.numero_2:
                AcrescentarUmaExpressao("2", true);
                break;

            case R.id.numero_3:
                AcrescentarUmaExpressao("3", true);
                break;

            case R.id.numero_4:
                AcrescentarUmaExpressao("4", true);
                break;

            case R.id.numero_5:
                AcrescentarUmaExpressao("5", true);
                break;

            case R.id.numero_6:
                AcrescentarUmaExpressao("6", true);
                break;

            case R.id.numero_7:
                AcrescentarUmaExpressao("7", true);
                break;

            case R.id.numero_8:
                AcrescentarUmaExpressao("8", true);
                break;

            case R.id.numero_9:
                AcrescentarUmaExpressao("9", true);
                break;

            case R.id.ponto:
                AcrescentarUmaExpressao(".", true);
                break;

            case R.id.soma:
                AcrescentarUmaExpressao("+", false);
                break;

            case R.id.subtracao:
                AcrescentarUmaExpressao("-", false);
                break;

            case R.id.multiplicacao:
                AcrescentarUmaExpressao("*", false);
                break;

            case R.id.bt_divisao:
                AcrescentarUmaExpressao("/", false);
                break;
        }
    }
}