package gea.servicios.noctambulos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import gea.servicios.noctambulos.adapters.lugaresAdapter;

public class LugaresActivity extends AppCompatActivity implements Serializable {
    private RecyclerView lugaresRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lugaresRecyclerView = (RecyclerView) findViewById(R.id.lugaresRecyclerView);
        lugaresRecyclerView.setHasFixedSize(true);
        lugaresRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<LugaresActivity> lista = (List<LugaresActivity>)
                getIntent().getSerializableExtra("listaObjetos");
        Log.i("Lugares", lista.toString());
     /*   lugaresAdapter adaptador = new lugaresAdapter(lista, LugaresActivity.this);
        lugaresRecyclerView.setAdapter(adaptador);
*/

    }


}
