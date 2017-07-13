package dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ta on 2017-07-11.
 */
public class DaoRes {

    @SerializedName("status")
    public boolean status;

    @SerializedName("data")
    public List<DaoData> data;

}
