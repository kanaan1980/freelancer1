package com.huthifa.freelancer;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private Object onClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.id_close:
                onBackPressed();
                break;
            case R.id.id_share:
                Intent sendIntent = new Intent();
                // تعيين الاجراء الذي نريده وهنا ارسال بيانات
                sendIntent.setAction(Intent.ACTION_SEND);
                // اضافة النص للانتنت
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,"\"market://details?id=\" + appPackageName تحميل التطبيق");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "مرحباً بكم جميعاً في مدونة اندرودي عربي"); // النص الذي تريد مشاركته
                // تعيين نوع البيانات التي تريد ارسالها وهي نص
                sendIntent.setType("text/plain");
                // تشغيل الانتنت السابق بالاضافة إلى تعيين النص الذي يظهر عند اختيار التطبيق الذي تريد مشاركة معه
                startActivity(Intent.createChooser(sendIntent,"اختار التطبيق الذي مشاركة النص معه :"));

                break;

            case R.id.id_1:

                startActivity(new Intent(getApplicationContext(), subjectList.class));
                break;

            case R.id.id_2:
                startActivity(new Intent(getApplication(),about_alfki.class));
                break;

            case R.id.id_3:
                startActivity(new Intent(getApplication(),about.class));
                break;

            case R.id.id_4:
                final String appPackageName = getPackageName(); // getPackageName() طلبنا اسم الباكيج الخاص للتطبيق من هذا التطبيق, لو أردت تقييم تطبيق اخر ضع اسم الباكيج الخاصة به
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appPackageName)));
                }
                break;
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(
                MainActivity.this);
        builder.setTitle("إغلاق التطبيق"); // العنوان
        builder.setMessage("هل متأكد تريد الخروج من التطبيق :("); // المحتوى
        builder.setPositiveButton("نعم", // الزر الاول
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        // الاوامر التي تحدث بعد الضغط على الزر الأاول
                        finish();

                    }
                });
        builder.setNegativeButton("لا", // الزر الثاني
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        // اوامر الزر الثاني

                    }
                });
        builder.show();


        }
    }

