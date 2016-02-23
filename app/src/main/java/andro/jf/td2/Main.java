package andro.jf.td2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class Main extends Activity {
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);  

    // Passé à l'activité des préférences
    View button = findViewById(R.id.prefs);
    button.setOnClickListener( new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        Intent go_to_prefs = new Intent(getApplicationContext(), 
            MesPreferences.class);
        startActivity(go_to_prefs);

      }
    });

    // Récupération d'une valeur de préférence
    View recup_login = findViewById(R.id.recup_login);
    recup_login.setOnClickListener( new View.OnClickListener() {

      @Override
      public void onClick(View v) {
        SharedPreferences prefs = 
            PreferenceManager.getDefaultSharedPreferences(
            getApplicationContext());

        Toast.makeText(getApplicationContext(), "Recup login: " +
        prefs.getString("login",""),
            Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Recup vitesse: " +
            prefs.getString("vitesse",""),
            Toast.LENGTH_SHORT).show();
      }
    });
  }
}