package com.yazdaniscodelab.phonecall_usingintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn=(Button)findViewById(R.id.cal_xml);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num="+8801966044564";
                startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+num)));


            }
        });


    }
}
