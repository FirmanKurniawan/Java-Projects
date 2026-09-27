package com.imk.abj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BuatAkun extends AppCompatActivity {
    private EditText user, nope ,pass, repass;
    private Button signup, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_akun);
        user = (EditText) findViewById (R.id.username);
        nope = (EditText) findViewById (R.id.nope);
        pass = (EditText) findViewById (R.id.password);
        repass = (EditText) findViewById (R.id.repassword);
        signup = (Button) findViewById (R.id.signup);
        reset = (Button) findViewById (R.id.reset);

        reset.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                user.setText("");
                nope.setText("");
                pass.setText("");
                repass.setText("");
            }
        });

        signup.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String usernameKey = user.getText ().toString ();
                String nopeKey = nope.getText ().toString ();
                String repasswordKey = repass.getText ().toString ();
                String passwordKey = pass.getText ().toString ();

                if (usernameKey.equals("") && nopeKey.equals("") && passwordKey.equals("")&& repasswordKey.equals("")){

                    Toast.makeText(BuatAkun.this, " Semua Kosong", Toast.LENGTH_SHORT).show();

                }
                else if(usernameKey.equals("")){
                    Toast.makeText(BuatAkun.this, "User Kosong", Toast.LENGTH_SHORT).show();
                }

                else if (passwordKey.equals("")){
                    Toast.makeText(BuatAkun.this, "Password Kosong", Toast.LENGTH_SHORT).show();
                }
                else if(repasswordKey.equals("")){
                    Toast.makeText(BuatAkun.this, "Re-Password Kosong", Toast.LENGTH_SHORT).show();
                }

                else if(!passwordKey.equals(repasswordKey)){
                    Toast.makeText(BuatAkun.this,"Password Tidak sama",Toast.LENGTH_SHORT).show();
                }


            }

        });



    }
}
