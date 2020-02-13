package com.example.cadastrodefuncionarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtnome;
    private EditText edtcpf;
    Button btnsalvar;
    ListView listview;
    List<Cadastro>();
    ArrayAdapter<Cadastro> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<Cadastro>();


        listview = findViewById(R.id.listview);
        edtnome = findViewById(R.id.edtnome);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNomes();


            }
        });
        ArrayAdapter<Cadastro> adapter = new ArrayAdapter<Cadastro>(this, android.R.layout.simple_list_item_1, d);

    }
    private void addNomes() {
        dados.add(edtnome.getText().toString() +" " + (edtcpf.getText().toString()));
        printaNomes();
    }
    private void printaNomes() {

        for (int i = 0; i < dados.size(); i++) {
            String nome = dados.get(i);
            System.out.println(nome);
        }
    }
}



/*add, uso para ir adicionando os nomes, usei o System para apenas aparecer no console
criei um array do tipo String que vai me retornar a lista
o nome do método não pode ser igual do array
Propriede da classe (puxo da XML)
Variavel é criar na propria classe java
i++ = incremento (próximo)

 */
/*listview.setAdapter(adapter);*/
/*ArrayAdapter<String> adapter;*/
/*adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dados);*/
