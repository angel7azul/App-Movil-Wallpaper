package utrng.estadias.maps.mapsestadias;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Lugares extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Iguala
        LatLng iguala = new LatLng(18.3448477, -99.53973439999999);

        //Leyva Bambina
        LatLng leyvaBambina = new LatLng(18.343164,-99.537996);
        mMap.addMarker(new MarkerOptions().position(leyvaBambina).title("Leyva").snippet("La bambina, Calle Juan Aldama"));

        //Guadalajara Bambina
        LatLng guadalajaraBambina = new LatLng(18.343463,-99.538212);
        mMap.addMarker(new MarkerOptions().position(guadalajaraBambina).title("Guadalajara").snippet("Farmacias Guadalajara, Calle Juan Aldama"));

        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(iguala,17));
    }
}
