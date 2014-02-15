package com.columbusagin.explicitintent;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ActivityB extends Activity implements OnClickListener {
    Button b;
    EditText txt;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
		b=(Button) findViewById(R.id.button1);
		txt=(EditText) findViewById(R.id.Text);
		b.setOnClickListener(this);
		
	
	}
		//b.setOnClickListener(new onClickListener(){
	//public void Goback(View v) {
		//Intent i = new Intent();
		
	//	String value=txt.getText().toString();
		//i.setData(Uri.parse(value));
	//	setResult(RESULT_OK, i);
		//startActivity(i);
		//finish();
		
	//}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button1:
			Intent data= new Intent();
			String value = txt.getText().toString();
			data.setData(Uri.parse(value));
			setResult(RESULT_OK, data);
			finish();
			break;
		}
		
	}

	
}
