package com.josecan.android.conteofragmentapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jose.can on 27/10/2017.
 */

public class ConteoFragment extends Fragment {
    int conteo = 0;
    EditText conteoEditText;
    Button contadorButton;
    Button reiniciarButton;


    public ConteoFragment() {
        super();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_conteo, container, false);

        conteoEditText = (EditText) v.findViewById(R.id.conteo_edit_text);
        contadorButton = (Button) v.findViewById(R.id.contador_button);
        reiniciarButton = (Button) v.findViewById(R.id.reiniciar_button);

        contadorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteo ++;
                conteoEditText.setText(Integer.toString(conteo));
            }
        });

        reiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conteo = 0;
                conteoEditText.setText(Integer.toString(conteo));
            }
        });

        return v;
    }
}
