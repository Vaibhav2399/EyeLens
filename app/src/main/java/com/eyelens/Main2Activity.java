package com.eyelens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgClick;
    Button btnTake, btnConform;
    Bitmap photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgClick = findViewById(R.id.img_click);
        btnTake = findViewById(R.id.btn_take);
        btnConform = findViewById(R.id.btn_go);

        btnConform.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        imgClick.setOnClickListener(this);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1888 && resultCode == RESULT_OK) {
            photo = (Bitmap) data.getExtras().get("data");
            imgClick.setImageBitmap(photo);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_click:
            case R.id.btn_take:
                Intent ci = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(ci, 1888);
                break;
            case R.id.btn_go:
                Intent i = new Intent(Main2Activity.this, WorkActivity.class);
                i.putExtra("PHOTO", photo);
                startActivity(i);
                break;
        }
    }
}
