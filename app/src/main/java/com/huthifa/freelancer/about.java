package com.huthifa.freelancer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by HK on 28/08/2017.
 */

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_);
    }

    public void onclick1( View v){

        switch (v.getId()){

            case R.id.but1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mail to :huthifak9@gmail.com?subject=كتاب طريقك للعمل الحر")));

                break;

            case R.id.but2:

                String developerName = "com.kanaan.speedDrive\n";     //ضع هنا اسم المبرمج الاسم المستخدم في المتجر
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q="+developerName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q="+developerName)));
                }

                break;
        }
    }


}
