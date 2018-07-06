package utrng.estadias.maps.mapsestadias;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FarmaciaFragment extends Fragment implements View.OnClickListener, View.OnFocusChangeListener{

    EditText nomF,callesF;
    Button addF;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_farmacia, container, false);

        nomF = view.findViewById(R.id.txt_nombreF);
        addF = view.findViewById(R.id.btn_AgregarF);
        callesF = view.findViewById(R.id.txt_calleF);
        addF.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_AgregarF:
                ErrorNombreF();
                break;
            default:
                break;
        }
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        switch (v.getId()) {
            case R.id.txt_nombreF:
                EtiqueteNomF(v,hasFocus);
                break;
            case R.id.txt_calleF:
                EtiqueteCalleF(v,hasFocus);
                break;
            default:
                break;
        }
    }

    public void ErrorNombreF(){
        if(nomF.length()>10){
            nomF.setError("Error");
        }
    }

    public void EtiqueteNomF(View v, boolean hasFocus){
        if (hasFocus) {
            nomF.setHint("Nombre");
        } else {
            nomF.setHint("");
        }
    }

    public void EtiqueteCalleF(View v, boolean hasFocus){
        if (hasFocus) {
            nomF.setHint("Calle");
        } else {
            nomF.setHint("");
        }
    }
}

