package gea.servicios.noctambulos.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import gea.servicios.noctambulos.LugaresActivity;
import gea.servicios.noctambulos.R;
import gea.servicios.noctambulos.model.Result;

/**
 * Created by vivip on 20/9/2017.
 */

public class lugaresAdapter extends RecyclerView.Adapter<lugaresAdapter.DeviceViewHolder> {

    private Context context;
    private List<Result> dataset;
    private OnLugarSelectedListener onLugarSelectedListener;

    private ArrayList<Result> mDataset;
    private Context c;
    private Activity activity;

    /* public climaAdapter(ArrayList<Ciudad> ciudades, Context c, Activity a) {
         this.mDataset = ciudades;
         this.c = c;
         this.activity = a;
     }
 */
    public interface OnLugarSelectedListener {
        void onPeliculaSelected(Result clima);
    }

    public lugaresAdapter(List<Result> dataset, LugaresActivity context) {
        this.dataset = dataset;
        this.context = context;
//        this.onPeliculaSelectedListener = (OnPeliculaSelectedListener) context;
    }

    @Override
    public DeviceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lugar, parent, false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DeviceViewHolder holder, int position) {
        Result r = dataset.get(position);
        holder.textViewCiudad.setText(String.valueOf(r.getGeometry().getLocation().getLat()));
        holder.textViewAbierto.setText(String.valueOf(r.getOpeningHours().getOpenNow()));
    /*    holder.textViewTemperatura.setText(String.valueOf(c.getMain().getTemp()));
        holder.textViewHumedad.setText(String.valueOf(c.getMain().getHumidity()));
*/
    /*    String url = "http://image.tmdb.org/t/p/w185" + p.getImagen();

        Glide.with(context).load(url).into(holder.fotoImageView);
*/
//        holder.setOnPeliculaItemClick(p, onPeliculaItemClickListener);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public static class DeviceViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewCiudad;
        private TextView textViewAbierto;
        private TextView textViewHumedad;


        public DeviceViewHolder(View itemView) {
            super(itemView);
            textViewCiudad=(TextView)itemView.findViewById(R.id.textViewNombre);
            textViewAbierto = (TextView) itemView.findViewById(R.id.textViewAbierto);
            textViewHumedad = (TextView) itemView.findViewById(R.id.textViewHumedad);

        }

        //     public void setDeviceSelectedListener(final Pelicula departamento, final OnPeliculaSelectedListener onPeliculaSelectedListener) {
//            cardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    onPeliculaSelectedListener.onPeliculaSelected(departamento);
//                }
//            });
    }

    public void add(Result ciudades) {
        dataset.add(ciudades);
        notifyDataSetChanged();
    }

    public void setDataset(List<Result> lugares) {
        if (lugares == null) {
            dataset = new ArrayList<>();
        } else {
            dataset = lugares;
        }
        notifyDataSetChanged();
    }

    public void clear() {
        dataset.clear();
        notifyDataSetChanged();
    }

}
