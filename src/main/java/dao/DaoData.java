package dao;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ta on 2017-07-11.
 */
public class DaoData {

    @SerializedName("title")
    public String title;

    @SerializedName("desc")
    public String desc;

    @SerializedName("img")
    public String img;

    @SerializedName("last_update")
    public String last_update;

}
