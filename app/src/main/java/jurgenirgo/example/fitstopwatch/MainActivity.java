package jurgenirgo.example.fitstopwatch;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash, tvSubSplash;
    Button btnget;
    Animation atg, btgone, btgtwo;
    ImageView ivSplash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplash = findViewById(R.id.tvSplash);
        tvSubSplash = findViewById(R.id.tvSubSplash);
        btnget = findViewById(R.id.btnget);
        ivSplash = findViewById(R.id.ivSplash);

        //load animation
        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        btgone = AnimationUtils.loadAnimation(this, R.anim.btgone);
        btgtwo = AnimationUtils.loadAnimation(this, R.anim.btgtwo);

        //passing animation
        ivSplash.startAnimation(atg);
        tvSplash.setAnimation(btgone);
        tvSubSplash.setAnimation(btgone);
        btnget.startAnimation(btgtwo);

        //passing event
        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this, StopWatchAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
