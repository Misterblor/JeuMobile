package fr.dablo.jeumobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import fr.dablo.jeumobile.model.monster.type.Golem;
import fr.dablo.jeumobile.model.player.classes.Wizard;

public class MainActivity extends AppCompatActivity {

    private TextView playerName;
    private TextView playerLVL;
    private ProgressBar playerHealth;
    private ProgressBar playerMana;

    private TextView monsterName;
    private ProgressBar monsterHealth;
    private ImageView monster;

    private final Wizard playerWizard = new Wizard();

    private Golem monsterGolem = new Golem();

    private TextView damageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        playerName = findViewById(R.id.playerName);
        playerLVL = findViewById(R.id.playerLVL);
        playerHealth = findViewById(R.id.playerHealth);
        playerMana = findViewById(R.id.playerMana);

        monsterName = findViewById(R.id.monsterName);
        monsterHealth = findViewById(R.id.monsterHealth);
        monster = findViewById(R.id.monster);


        playerWizard.setName("Misterblor/JayR");

        playerName.setText(playerWizard.getName());
        playerLVL.setText(" | LVL " + playerWizard.getLvl() + " (" + playerWizard.getCurrentXp() + "/" + playerWizard.getXpNeededToNextLvl() + ")");

        playerHealth.setProgress((playerWizard.getCurrentHp()/playerWizard.getHpMax())*100);
        playerMana.setProgress((playerWizard.getCurrentMana()/playerWizard.getManaMax())*100);



        monsterName.setText("LVL " + monsterGolem.getLvl() + " | " + monsterGolem.getName() + " (" + monsterGolem.getCurrentHp() + "/" + monsterGolem.getHpMax() + "HP)");
        monsterHealth.setProgress((monsterGolem.getCurrentHp()/monsterGolem.getHpMax())*100);

        damageIndicator = findViewById(R.id.damageIndicator);

        monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                playerWizard.attack((playerWizard.getPhysicDamage()/monsterGolem.getPhysicResistance())*playerWizard.getPhysicDamage() + (playerWizard.getMagicDamage()/monsterGolem.getMagicResistance())*playerWizard.getMagicDamage(), monsterGolem);
                damageIndicator.setText((playerWizard.getPhysicDamage()/monsterGolem.getPhysicResistance())*playerWizard.getPhysicDamage() + " | " + (playerWizard.getMagicDamage()/monsterGolem.getMagicResistance())*playerWizard.getMagicDamage());
                monsterName.setText("LVL " + monsterGolem.getLvl() + " | " + monsterGolem.getName() + " (" + monsterGolem.getCurrentHp() + "/" + monsterGolem.getHpMax() + "HP)");
                monsterHealth.setProgress((int)(((double)monsterGolem.getCurrentHp()/monsterGolem.getHpMax())*100));
                if (monsterGolem.getCurrentHp() == 0){
                    playerWizard.recieveXp(monsterGolem.getXpDropped());
                    playerLVL.setText(" | LVL " + playerWizard.getLvl() + " (" + playerWizard.getCurrentXp() + "/" + playerWizard.getXpNeededToNextLvl() + ")");
                    monsterGolem = new Golem();
                }
                monsterName.setText("LVL " + monsterGolem.getLvl() + " | " + monsterGolem.getName() + " (" + monsterGolem.getCurrentHp() + "/" + monsterGolem.getHpMax() + "HP)");
                monsterHealth.setProgress((int)(((double)monsterGolem.getCurrentHp()/monsterGolem.getHpMax())*100));
            }
        });
    }
}