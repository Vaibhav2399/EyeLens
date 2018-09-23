package com.eyelens;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class WorkActivity extends AppCompatActivity {
    Bitmap photo;
    ImageView imgFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        imgFinal=findViewById(R.id.img_final);

        Intent i=getIntent();
        photo=(Bitmap) i.getExtras().get("PHOTO");
        imgFinal.setImageBitmap(photo);


    }
}
