package com.columbusagin.explicitintent;

import java.io.ObjectOutputStream.PutField;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button b;
	 EditText txt;
	 int request_code;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		request_code=1;

		b=(Button) findViewById(R.id.button1);
		txt=(EditText) findViewById(R.id.Text1);	
		b.setOnClickListener(this);
		/*b.setOnClickListener(new OnClickListener() {
		
	@Override
	public void Clicked(View v){
	
	
	}
});*/
}


	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button1:
			Intent i = new Intent(this,ActivityB.class);
			
			startActivityForResult(i, request_code);
			break;
		}
	}
	public void onActivityResult(int requestcode, int resultcode, Intent data)
	{
		if(request_code==requestcode){
			if(resultcode==RESULT_OK){
				txt.setText(data.getData().toString());
				//Toast.makeText(getBaseContext(), data.getData().toString(), Toast.LENGTH_SHORT).show();
			}
		}
	}


}
