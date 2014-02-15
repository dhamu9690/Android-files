package com.columbusagain.mycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	public String str ="";
	Character op ='q';
	int i, num,numtemp;
	EditText showResult;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		showResult=(EditText)findViewById(R.id.textResult);
	}

	public void btnoneClicked(View v)
	{
		insert(1);
	}
	public void btntwoClicked(View v)
	{
		insert(2);
	}
	
	public void btnthreeClicked(View v)
	{
		insert(3);
	}
	public void btnfourClicked(View v)
	{
		insert(4);
	}
	public void btnfiveClicked(View v)
	{
		insert(5);
	}
	public void btnsixClicked(View v)
	{
		insert(6);
	}
	public void btnsevenClicked(View v)
	{
		insert(7);
	}
	public void btneightClicked(View v)
	{
		insert(8);
	}
	public void btnnineClicked(View v)
	{
		insert(9);
	}
	public void btnzeroClicked(View v)
	{
		insert(0);
	}
	
	public void btnminusClicked(View v){
		perform();
			op = '-';
	}
	public void btnplusClicked(View v){
		perform();
			op = '+';
	}
	public void btndivClicked(View v){
		perform();
			op = '/';
	}
	public void btnmulClicked(View v){
		perform();
			op = '*';
	}
	public void btnequalClicked(View v){
		calculate();
	}
	public void resetClicked(View v){
		reset();
	}
	private void reset(){
		str="";
		op = 'q';
		num=0;
		numtemp=0;
		showResult.setText("");
	}
	private void insert(int j){
		str =str+Integer.toString(j);
		num=Integer.valueOf(str).intValue();
		showResult.setText(str);
	}
	public void perform(){
		str ="";
		numtemp =num;
	}
	public void calculate(){
		if(op=='+')
			num=numtemp+num;
		else if(op=='-')
			num=numtemp-num;
		else if(op=='*')
			num=numtemp*num;
		else if(op=='/')
			num=numtemp/num;
		showResult.setText(""+num);
	}
	}
	
