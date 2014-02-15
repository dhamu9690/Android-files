package com.columbusagain.locationpendingintent;



import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txtlat;
	TextView txtlon;
	PendingIntent pendingIntent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtlat=(TextView)findViewById(R.id.textlat);
		txtlon=(TextView)findViewById(R.id.textlong);
		LocationManager locationmanager= (LocationManager)getSystemService(Context.LOCATION_SERVICE);
		Intent i=new Intent(this, MyLocationReceiver.class);
		pendingIntent=PendingIntent.getBroadcast(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
		locationmanager.requestLocationUpdates(locationmanager.GPS_PROVIDER, 0, 0, pendingIntent);
		if(MyLocationReceiver.loc!=null)
		{
			double plong=MyLocationReceiver.loc.getLongitude();
			double plat=MyLocationReceiver.loc.getLatitude();
			txtlat.setText(Double.toString(plat));
			txtlon.setText(Double.toString(plong));
		}
	}
}
