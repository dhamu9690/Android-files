package com.columbusagain.mylocation;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txtlat;
	TextView txtlon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtlat=(TextView)findViewById(R.id.textlat);
		txtlon=(TextView)findViewById(R.id.textlong);
		LocationManager locationmanager= (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
		LocationListener locationlistener= new LocationListener() {
		
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProviderEnabled(String provider) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProviderDisabled(String provider) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onLocationChanged(Location location) {
				// TODO Auto-generated method stub
				if(location!=null)
				{
					double plong=location.getLongitude();
					double plat=location.getLatitude();
					txtlat.setText(Double.toString(plat));
					txtlon.setText(Double.toString(plong));
				}
			}

			
		};
		locationmanager.requestLocationUpdates(locationmanager.GPS_PROVIDER, 0, 0, locationlistener);
	}

	
}
