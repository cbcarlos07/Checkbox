package checkbox.cursoandroid.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private Button botao;
     private CheckBox checkBoxCao;
     private CheckBox checkBoxGato;
     private CheckBox checkBoxPapagaio;
     private TextView textoExibicao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCao  = (CheckBox) findViewById(R.id.checkBoxCaoId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio = (CheckBox) findViewById(R.id.checkboxPapagaioId);

        botao = (Button) findViewById(R.id.botaoMostrarId);

        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);
        textoExibicao = (TextView) findViewById(R.id.textoExibicaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itensSelecionado = "";
                itensSelecionado += "Item: "+checkBoxCao.getText() + "Ststus:  "+ checkBoxCao.isChecked()+"\n";
                itensSelecionado += "Item: "+checkBoxGato.getText()  + "Ststus:  "+ checkBoxGato.isChecked()+ "\n";
                itensSelecionado += "Item: "+checkBoxPapagaio.getText()  + "Ststus:  "+ checkBoxPapagaio.isChecked()+ "\n";

                textoExibicao.setText(itensSelecionado);


            }
        });
    }
}
