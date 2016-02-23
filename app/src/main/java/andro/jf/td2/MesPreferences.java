package andro.jf.td2;

import android.os.Bundle;
import android.preference.PreferenceActivity;

// Activité de gestion des préférences
public class MesPreferences extends PreferenceActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.prefs);
  }

}
