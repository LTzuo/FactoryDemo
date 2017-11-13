package com.ltz.factorydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ltz.factorydemo.factory.IJuice;
import com.ltz.factorydemo.factory.JuiceFactory;

/**
 * 设计模式之工厂模式
 */
public class MainActivity extends AppCompatActivity {

    private Button apple,orange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apple = (Button) findViewById(R.id.apple);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IJuice appleJuice = JuiceFactory.createJuice("apple") ;
                Toast.makeText(MainActivity.this,appleJuice.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        orange = (Button) findViewById(R.id.orange);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IJuice orangeJuice = JuiceFactory.createJuice("orange") ;
                Toast.makeText(MainActivity.this,orangeJuice.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
