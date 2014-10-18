package br.com.rgn.androidrgnapp01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Inicio extends Activity {
	
	public final static String TEXTO_VINDO_DA_TELA_INICIO = "texto_vindo_da_tela_inicio";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inicio);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Exibe os items do menu para uso na barra de ações
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.inicio, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	/**
	 * Método que pega texto digitado e exibe na tela de exibição
	 * @param componenteVisual O campo de texto onde usuário digitou
	 */
	public void mostrarMensagem(View componenteVisual){
		Intent intencao = new Intent(this, ExibicaoDeTextoDigitado.class);
		EditText editText = (EditText) findViewById(R.id.textoDoUsuario);
		String textoDigitado = editText.getText().toString();
		intencao.putExtra(TEXTO_VINDO_DA_TELA_INICIO, textoDigitado);
		startActivity(intencao);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Trata pressoes nos itens da barra de acao
	    switch (item.getItemId()) {
	        case R.id.AcaoDeBusca:
	            openSearch();
	            return true;
	        case R.id.AcaoDeConfiguracoes:
	            openSettings();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	private void openSettings() {
		Intent intencao = new Intent(this, ExibicaoDeTextoDigitado.class);
		intencao.putExtra(TEXTO_VINDO_DA_TELA_INICIO, "Configurações está em Desenvolvimento");
		startActivity(intencao);
	}

	private void openSearch() {
		Intent intencao = new Intent(this, ExibicaoDeTextoDigitado.class);
		intencao.putExtra(TEXTO_VINDO_DA_TELA_INICIO, "Busca está em Desenvolvimento");
		startActivity(intencao);
	}

}
