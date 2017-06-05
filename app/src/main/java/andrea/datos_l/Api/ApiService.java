package andrea.datos_l.Api;

import java.util.ArrayList;

import andrea.datos_l.Modelo.Animales;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andrea on 4/06/17.
 */

public interface ApiService {

    @GET("r6g7-nmt3.json")
    Call<ArrayList<Animales>> obtenerListaAnimales();


}
