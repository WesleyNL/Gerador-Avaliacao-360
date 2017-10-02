package br.com.app;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

import br.com.app.activity.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setDisplayUseLogoEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);
        getActionBar().setIcon(R.drawable.ic_logotipo);

        TextView txtNota = (TextView) findViewById(R.id.lblNota);
        SpannableString content = new SpannableString("10");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        txtNota.setText(content);
    }

    public void gerar(View view){
        TextView txtNota = (TextView) findViewById(R.id.lblNota);
        SpannableString content = new SpannableString(String.valueOf((int)(Math.random() * 5 + 6)));
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        txtNota.setText(content);
    }
}
