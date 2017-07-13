import dao.DaoData;
import dao.DaoRes;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ta on 2017-07-11.
 */
public interface ApiService {

    @GET("/test")
    Call<DaoRes> load();
}
