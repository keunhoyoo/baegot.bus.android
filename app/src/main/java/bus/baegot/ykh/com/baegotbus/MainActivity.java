package bus.baegot.ykh.com.baegotbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapController;
import com.nhn.android.maps.NMapView;
import com.nhn.android.maps.maplib.NGeoPoint;

public class MainActivity extends NMapActivity {

    // API-KEY
    private static final String API_KEY = "5NLJ2m79PG264wfrsGSi";

    NMapView mapView = null;
    NMapController mapController = null;
    LinearLayout mapContainer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mapView = new NMapView(this);
        mapController = mapView.getMapController();
        mapView.setApiKey(API_KEY);

        //((LinearLayout)findViewById(R.id.mapLayout)).addView(mapView);
        setContentView(mapView);

        mapView.setClickable(true);
        mapView.setEnabled(true);
        mapView.setFocusable(true);
        mapView.setFocusableInTouchMode(true);
        mapView.requestFocus();
        mapController.setMapCenter(new NGeoPoint(126.978371, 37.566691), 11);



    }
}
