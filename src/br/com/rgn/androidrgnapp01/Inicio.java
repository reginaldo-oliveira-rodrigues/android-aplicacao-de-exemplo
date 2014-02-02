package br.com.rgn.androidrgnapp01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Inicio extends Activity {
	public final static String TEXTO_DIGITADO = "texto_digitado_pelo_usuario";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
		return true;
	}
	
	/**
	 * Método que pega texto digitado e exibe na tela de exibição
	 * @param componenteVisual O campo de texto onde usuário digitou
	 */
	public void mostrarMensagem(View componenteVisual){
		Intent intencao = new Intent(this, ExibicaoDeTextoDigitado.class);
		EditText editText = (EditText) findViewById(R.id.textoDoUsuario);
		String textoDigitado = editText.getText().toString();
		intencao.putExtra(TEXTO_DIGITADO, textoDigitado);
		startActivity(intencao);
	}

}
