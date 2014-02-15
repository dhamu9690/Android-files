package com.example.helloword;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.*;

public class helloword extends Activity {
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView textview = new TextView(this);
    textview.setText("Hello World!");
    Log.d("logcreate","working");
    setContentView(R.layout.activity_hello);
    
    }
  }
