package com.columbusagain.calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	Button mPlusbutton,mMinusbutton,mMulbutton,mDivbutton,mResult;
	EditText mInputtext;
	int mInput1,mInput2,mOutput;
	private static final int PLUS = 1;
	private static final int MINUS = 2;
	private static final int MUL = 3;
	private static final int DIV = 4;
	private int mCalculationType;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mInputtext=(EditText)findViewById(R.id.input);
		mPlusbutton=(Button)findViewById(R.id.plus);
		mMinusbutton=(Button)findViewById(R.id.minus);
		mMulbutton=(Button)findViewById(R.id.mul);
		mDivbutton=(Button)findViewById(R.id.div);
		mResult=(Button)findViewById(R.id.result);
		mPlusbutton.setOnClickListener(this);
		mMinusbutton.setOnClickListener(this);
		mMulbutton.setOnClickListener(this);
		mDivbutton.setOnClickListener(this);
		mResult.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		switch(view.getId()){
		case R.id.plus:
			mInput1 = Integer.parseInt(mInputtext.getText().toString());
			mInputtext.setText("");
			mCalculationType = PLUS;
			break;
		case R.id.minus:
			mInput1 = Integer.parseInt(mInputtext.getText().toString());
			mInputtext.setText("");
			mCalculationType = MINUS;
			break;
		case R.id.mul:
			mInput1 = Integer.parseInt(mInputtext.getText().toString());
			mInputtext.setText("");
			mCalculationType = MUL;
			break;
		case R.id.div:
			mInput1 = Integer.parseInt(mInputtext.getText().toString());
			mInputtext.setText("");
			mCalculationType = DIV;
			break;
		case R.id.result:
			mInput2 = Integer.parseInt(mInputtext.getText().toString());
			mInputtext.setText(calculateResult());
			
			break;
		}
		
	}
	
	private String calculateResult(){
		int result;
		switch(mCalculationType){
		case PLUS:
			result = mInput1+mInput2;
			return String.valueOf(result);
		case MINUS:
			result =mInput1-mInput2;
			return String.valueOf(result);
		case DIV:
			result =mInput1/mInput2;
			return String.valueOf(result);
		case MUL:
			result =mInput1*mInput2;
			return String.valueOf(result);
			default:
				break;
		
		}
		return null;
	}

}
