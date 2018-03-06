package br.usjt.ftce.progmulti.meuprimeiroappsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
//Gabrielle Nascimento 81612332


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Gabrielle Nascimento 81612332
        super.onCreate(savedInstanceState);
        //conecta layout
        setContentView(R.layout.activity_main);
    }

    public final static String EXTRA_MESSAGE =
            "br.usjt.ftce.progmulti.meuprimeiroappsi.MainActivity.MESSAGE";

    public void sendMessage(View view) {
        //Gabrielle Nascimento 81612332
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //conecta os campos
        EditText editText = (EditText)findViewById(R.id.edit_message);
        //pegar o que esta escrito no campo
        String message = editText.getText().toString();
       intent.putExtra(EXTRA_MESSAGE, message);
       startActivity(intent);


    }


}
