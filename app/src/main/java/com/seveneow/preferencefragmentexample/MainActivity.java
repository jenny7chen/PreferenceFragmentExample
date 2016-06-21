package com.seveneow.preferencefragmentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button normal = (Button) findViewById(R.id.normal);
    Button preference = (Button) findViewById(R.id.preference);

    if (normal == null || preference == null)
      return;

    normal.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ExampleActivity.class));
      }
    });

    preference.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, ExamplePreferenceActivity.class));
      }
    });
  }
}
