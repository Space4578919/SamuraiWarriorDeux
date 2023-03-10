package cz.android.games.apps.lilith.samuraiwarrior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cz.android.games.apps.lilith.samuraiwarrior.ui.main.MainActivity2Fragment;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainActivity2Fragment.newInstance())
                    .commitNow();
        }
    }
}
