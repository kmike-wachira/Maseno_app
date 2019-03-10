package io.etcetera.maseo_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private  Button button;
    private  Button bsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=(Button)findViewById(R.id.butonIntent);
        bsignup=(Button)findViewById(R.id.button_signup);

    }
    public  void btnClickIntent(View view){
        Intent intent=new Intent (this,MainActivity.class);
        startActivity(intent);

    }

    public  void BtnClickSignup(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

}
