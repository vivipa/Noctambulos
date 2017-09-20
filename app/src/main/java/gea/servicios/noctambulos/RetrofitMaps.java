package gea.servicios.noctambulos;

import gea.servicios.noctambulos.model.PlacesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by vivip on 17/9/2017.
 */

public interface RetrofitMaps {
    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<PlacesResponse> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);
}


