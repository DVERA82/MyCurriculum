package com.example.mycurriculum;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycurriculum.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {

    private ActivityContactBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent( Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/daniela.veraarredondo"));
                startActivity(facebookIntent);


                Toast.makeText(ContactActivity.this,"si pasa",Toast.LENGTH_SHORT);

            }



        });
         mBinding.imageViewInstagram.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent instagramIntent = new Intent( Intent.ACTION_VIEW);
                 instagramIntent.setData(Uri.parse("https://instagram.com/dveritas?igshid=2n2xmbem220a "
                 ));
                 startActivity(instagramIntent);

             }
         });
         mBinding.imageViewPhone.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 shareWithWsp("hola esto va para el whatsapp");
             }
         });
      }
      public void shareWithWsp(String message){
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");
        //sendIntent.setPackage("Con.Whatsapp");
        startActivity(sendIntent);
      }
}