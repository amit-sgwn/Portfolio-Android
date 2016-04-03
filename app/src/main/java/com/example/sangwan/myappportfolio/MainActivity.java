package com.example.sangwan.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_spotify,button_scores_app,button_library_app,button_build_it_bigger,button_xyz_reader,button_capstone;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_spotify = (Button)findViewById(R.id.button_spotify);
        button_scores_app= (Button)findViewById(R.id.button_scores_app);
        button_library_app = (Button)findViewById(R.id.button_library_app);
        button_build_it_bigger=(Button)findViewById(R.id.button_build_it_bigger);
        button_xyz_reader=(Button)findViewById(R.id.button_xyz_reader);
        button_capstone =(Button)findViewById(R.id.button_capstone);
        button_spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                CharSequence text= "This button will launch my "+button_spotify.getText()+"App";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        button_build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                String text ="This button will launch my "+button_build_it_bigger.getText()+"App";
                int duration = Toast.LENGTH_SHORT;
                Toast toast =Toast.makeText(context,text,duration);
                toast.show();
            }
        });
        button_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                String text ="This button will launch my "+button_capstone.getText()+"App";
                int duration =Toast.LENGTH_LONG;
                Toast toast =Toast.makeText(context,text,duration);
                toast.show();
            }
        });
        button_scores_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                String text ="This button will launch my "+button_scores_app.getText()+"App";
                int duration =Toast.LENGTH_LONG;
                Toast toast =Toast.makeText(context,text,duration);
                toast.show();
            }
        });
        button_library_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                String text ="This button will launch my "+button_library_app.getText()+"App";
                int duration =Toast.LENGTH_LONG;
                Toast toast =Toast.makeText(context,text,duration);
                toast.show();
            }
        });
        button_xyz_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                String text ="This button will launch my "+button_xyz_reader.getText()+"App";
                int duration =Toast.LENGTH_LONG;
                Toast toast =Toast.makeText(context,text,duration);
                toast.show();
            }
        });
        button_spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = getApplicationContext();
                String text ="This button will launch my "+button_scores_app.getText()+"App";
                int duration =Toast.LENGTH_LONG;
                Toast toast =Toast.makeText(context,text,duration);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
