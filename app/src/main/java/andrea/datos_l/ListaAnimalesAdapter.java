package andrea.datos_l;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import andrea.datos_l.Modelo.Animales;

/**
 * Created by andrea on 4/06/17.
 */

public class ListaAnimalesAdapter extends RecyclerView.Adapter<ListaAnimalesAdapter.ViewHolder> {
    private ArrayList<Animales> dataset;

    private Context context;

    public ListaAnimalesAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animales, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Animales animal = dataset.get(position);

        holder.especie.setText(animal.getEspecie().toString());
        holder.clase.setText(animal.getClase().toString());
        holder.descripcion.setText(animal.getDescripci_n_producto());
        holder.presentacion.setText(animal.getPresentaci_n().toString());

        if (holder.especie.getText().equals("Bovinos")) {
            holder.imagen.setImageResource(R.drawable.bovinos);
        }
        if (holder.especie.getText().equals("Ovinos")) {
            holder.imagen.setImageResource(R.drawable.ovino);
        }
        if (holder.especie.getText().equals("Borregos")) {
            holder.imagen.setImageResource(R.drawable.ovino);
        }
        if (holder.especie.getText().equals("Ovicaprinos")) {
            holder.imagen.setImageResource(R.drawable.ovino);
        }
        if (holder.especie.getText().equals("Aves")) {
            holder.imagen.setImageResource(R.drawable.aves);
        }

        if (holder.especie.getText().equals("Aves ornamentales (canarios, pericos, loros)")) {
            holder.imagen.setImageResource(R.drawable.aves1);
        }
        if (holder.especie.getText().equals("Terneras")) {
            holder.imagen.setImageResource(R.drawable.bovinos);
        }
        if (holder.especie.getText().equals("Terneros")) {
            holder.imagen.setImageResource(R.drawable.bovinos);
        }
        if (holder.especie.getText().equals("Cachorros")) {
            holder.imagen.setImageResource(R.drawable.cachorros);
        }
        if (holder.especie.getText().equals("Caninos")) {
            holder.imagen.setImageResource(R.drawable.caninos);
        }
        if (holder.especie.getText().equals("Conejos")) {
            holder.imagen.setImageResource(R.drawable.conejos);
        }
        if (holder.especie.getText().equals("Equinos")) {
            holder.imagen.setImageResource(R.drawable.equinos);
        }
        if (holder.especie.getText().equals("Potros")) {
            holder.imagen.setImageResource(R.drawable.equinos);
        }
        if (holder.especie.getText().equals("Pequeños Felinos")) {
            holder.imagen.setImageResource(R.drawable.felinos);
        }
        if (holder.especie.getText().equals("Felinos")) {
            holder.imagen.setImageResource(R.drawable.felinos);
        }
        if (holder.especie.getText().equals("Lechones")) {
            holder.imagen.setImageResource(R.drawable.lechones);
        }
        if (holder.especie.getText().equals("Porcinos")) {
            holder.imagen.setImageResource(R.drawable.lechones);
        }

    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void adicionarListaAnimales(ArrayList<Animales> listaAnimales) {
        dataset.addAll(listaAnimales);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView especie;
        private TextView clase;
        private TextView descripcion;
        private TextView presentacion;
        private ImageView imagen;



        public ViewHolder(View itemView) {
            super(itemView);
            especie = (TextView) itemView.findViewById(R.id.tv_especie);
            clase= (TextView) itemView.findViewById(R.id.tv_clase);
            descripcion=(TextView) itemView.findViewById(R.id.tv_descripcion);
            presentacion=(TextView) itemView.findViewById(R.id.tv_presentacion);
            imagen=(ImageView) itemView.findViewById(R.id.img );

        }
    }




}
