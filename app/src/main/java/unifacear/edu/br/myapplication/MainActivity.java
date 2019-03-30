package unifacear.edu.br.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Double valor1 = 0.0;
    Double valor2 = 0.0;
    int operacao = 0;
    Double resultado = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMult = findViewById(R.id.btnMult);
        Button btnSoma = findViewById(R.id.btnSoma);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnIgual = findViewById(R.id.btnIgual);
        Button btnC = findViewById(R.id.btnC);
        Button btnPonto = findViewById(R.id.btnPonto);
        Button btnPercent = findViewById(R.id.btnPercent);
        Button btnExpoente = findViewById(R.id.btnExpoente);
        Button btnRaiz = findViewById(R.id.btnRaiz);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnSoma.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnPonto.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnExpoente.setOnClickListener(this);
        btnRaiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final TextView tv = findViewById(R.id.resultado);
        final TextView txtAns = findViewById(R.id.txtAns);

           if(v.getId() == R.id.btn0) {
               tv.setText(tv.getText() + "0");
           } else if (v.getId() == R.id.btn1) {
               tv.setText(tv.getText() + "1");
           } else if (v.getId() == R.id.btn2) {
               tv.setText(tv.getText() + "2");
           } else if (v.getId() == R.id.btn3) {
               tv.setText(tv.getText() + "3");
           } else if (v.getId() == R.id.btn4) {
               tv.setText(tv.getText() + "4");
           } else if (v.getId() == R.id.btn5) {
               tv.setText(tv.getText() + "5");
           } else if (v.getId() == R.id.btn6) {
               tv.setText(tv.getText() + "6");
           } else if (v.getId() == R.id.btn7) {
               tv.setText(tv.getText() + "7");
           } else if (v.getId() == R.id.btn8) {
               tv.setText(tv.getText() + "8");
           } else if (v.getId() == R.id.btn9) {
               tv.setText(tv.getText() + "9");
           } else if (tv.getId() == R.id.btnPonto) {
               tv.setText(tv.getText() + ".");
           } else if (v.getId() == R.id.btnPonto) {
               if(tv.getText() == "") {
                   tv.setText("0.");
               } else {
                   tv.setText(tv.getText() + ".");
               }
           } else if (v.getId() == R.id.btnDiv) {
               if (tv.getText() == "") {
                   txtAns.setText("0/");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       valor1 = Math.sqrt(valor1);
                       txtAns.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText(txtAns.getText() + valor1.toString() + "/");
               }
               operacao = 1;
               tv.setText("");

           } else if (v.getId() == R.id.btnMult) {
               if (tv.getText() == "") {
                   txtAns.setText("0x");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       valor1 = Math.sqrt(valor1);
                       txtAns.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText(txtAns.getText() + valor1.toString() + "x");
               }
               operacao = 2;
               tv.setText("");

           } else if (v.getId() == R.id.btnSoma) {
               if (tv.getText() == "") {
                   txtAns.setText("0+");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       valor1 = Math.sqrt(valor1);
                       txtAns.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText(txtAns.getText() + valor1.toString() + "+");
               }
               operacao = 3;
               tv.setText("");

           } else if (v.getId() == R.id.btnSub) {
               if (tv.getText() == "") {
                   txtAns.setText("0-");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       valor1 = Math.sqrt(valor1);
                       txtAns.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText(txtAns.getText() + valor1.toString() + "-");
               }
               operacao = 4;
               tv.setText("");

           } else if (v.getId() == R.id.btnPercent) {
               if (tv.getText() == "") {
                   txtAns.setText("0%");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       valor1 = Math.sqrt(valor1);
                       txtAns.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText(txtAns.getText() + valor1.toString() + "%");
               }
               operacao = 5;
               tv.setText("");
           } else if(v.getId() == R.id.btnExpoente) {
               if (tv.getText() == "") {
                   txtAns.setText("0^");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       valor1 = Math.sqrt(valor1);
                       txtAns.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText(txtAns.getText() + valor1.toString() + "^");
               }
               operacao = 6;
               tv.setText("");
           } else if(v.getId() == R.id.btnRaiz) {
               if (tv.getText() == "") {
                   txtAns.setText("√0");
               } else if (txtAns.getText() != "") {
                   if (operacao == 1) {
                       valor1 = valor1 / Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 2) {
                       valor1 = valor1 * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 3) {
                       valor1 = valor1 + Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if (operacao == 4) {
                       valor1 = valor1 - Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 5) {
                       valor1 = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 6) {
                       valor1 = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                       txtAns.setText(valor1.toString());
                   } else if(operacao == 7) {
                       txtAns.setText("√" + tv.getText());
                       valor1 = Math.sqrt(Double.valueOf(tv.getText().toString()));
                       tv.setText(valor1.toString());
                   }
               } else {
                   valor1 = Double.valueOf(tv.getText().toString());
                   txtAns.setText("√" + valor1.toString());
                   resultado = Math.sqrt(valor1);
                   tv.setText(resultado.toString());
               }
               operacao = 7;

           } else if (v.getId() == R.id.btnIgual) {
               txtAns.setText("");
               if (operacao == 1) {
                   if (Double.valueOf(tv.getText().toString()) == 0) {
                       tv.setText("Celoko, tio!?");
                   } else {
                       resultado = valor1 / Double.valueOf(tv.getText().toString());
                       tv.setText(resultado.toString());
                   }
               } else if (operacao == 2) {
                   resultado = valor1 * Double.valueOf(tv.getText().toString());
                   tv.setText(resultado.toString());
               } else if (operacao == 3) {
                   resultado = valor1 + Double.valueOf(tv.getText().toString());
                   tv.setText(resultado.toString());
               } else if (operacao == 4) {
                   resultado = valor1 - Double.valueOf(tv.getText().toString());
                   tv.setText(resultado.toString());
               } else if (operacao == 5) {
                   resultado = (valor1 / 100) * Double.valueOf(tv.getText().toString());
                   tv.setText(resultado.toString());
               } else if (operacao == 6) {
                   if(tv.getText() == "0") {
                       resultado = 1.0;
                   } else {
                       resultado = Math.pow(valor1, Double.valueOf(tv.getText().toString()));
                   }
                   tv.setText(resultado.toString());
               }
           } else if (v.getId() == R.id.btnC) {
               txtAns.setText("");
               tv.setText("");
               valor1 = 0.0;
               resultado = 0.0;
           }
    }

}
