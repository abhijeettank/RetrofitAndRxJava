package com.creativeinfoway.retrofitparamaters;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Nitin on 09/08/17.
 */

public interface APIService {
    @GET("/bins/tdze5")
    Observable<ResponseClass> getdata();
}
