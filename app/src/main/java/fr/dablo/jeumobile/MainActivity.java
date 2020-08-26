package fr.dablo.jeumobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import fr.dablo.jeumobile.model.player.classes.Wizard;

public class MainActivity extends AppCompatActivity {

    private TextView playerName;
    private TextView playerLVL;

    private ProgressBar playerHealth;
    private ProgressBar playerMana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        playerName = findViewById(R.id.playerName);
        playerLVL = findViewById(R.id.playerLVL);

        playerHealth = findViewById(R.id.playerHealth);
        playerMana = findViewById(R.id.playerMana);

        Wizard playerWizard = new Wizard();
        playerWizard.setName("Misterblor/JayR");

        playerName.setText(playerWizard.getName());
        playerLVL.setText("LVL " + playerWizard.getLvl() + " (" + playerWizard.getCurrentXp() + "/" + playerWizard.getXpNeededToNextLvl() + ")");

        playerHealth.setProgress((playerWizard.getCurrentHp()/playerWizard.getHpMax())*100);
        playerMana.setProgress((playerWizard.getCurrentMana()/playerWizard.getManaMax())*100);
    }
}