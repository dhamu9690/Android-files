package com.columbusagain.locationpendingintent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.widget.Toast;

public class MyLocationReceiver extends BroadcastReceiver {
	public static Location loc;
	@Override
	public void onReceive(Context context,Intent intent){
	String locationKey = LocationManager.KEY_LOCATION_CHANGED;
	if(intent.hasExtra(locationKey)){
		loc =(Location)intent.getExtras().get(locationKey);
		//Toast.makeText(context, "Lat:"+loc.getLatitude()+"Lng:"+loc.getLongitude(), Toast.LENGTH_SHORT).show();
	}

}
}
