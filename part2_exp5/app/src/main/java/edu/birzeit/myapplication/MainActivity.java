package edu.birzeit.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonRotate=(Button)findViewById(R.id.button_rotate);
    Button buttonScale=(Button) findViewById(R.id.button_scale);
    Button buttonTranslate =(Button)
            findViewById(R.id.button_translate); final ImageView
            imageView = (ImageView) findViewById(R.id.imageView);
buttonRotate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.t
                    his,R.anim.rotate));
        }
    });
buttonScale.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.t
                    his,R.anim.scale));
        }
    });
buttonTranslate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            imageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate));
        }
    });

}