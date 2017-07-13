import dao.DaoData;
import dao.DaoRes;
import okhttp3.ResponseBody;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;

class Main {
    public static void main(String[] args) {
        System.out.println("start");

        Observable
                //.just(1,2,3)
                .fromCallable((Callable<String>) () -> {
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("http://api.nainee.com/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

                    ApiService service = retrofit.create(ApiService.class);

                    System.out.println("call 1");
                    DaoRes res = service.load().execute().body();

                    String str = "";

                    for (DaoData ech : res.data) {
                        str += ech.title + ", ";
                    }

                    return str;
                })
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String i) {
                        System.out.println("onNext: " + i);
                    }
                });

    }
}