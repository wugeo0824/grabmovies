package com.xijun.crepe.grabmovies;

import android.app.Application;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import okhttp3.OkHttpClient;

/**
 * Created by LiXijun on 2016/3/4.
 */
public class GrabMoviesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //To add OkHttp3 integration to Picasso https://github.com/JakeWharton/picasso2-okhttp3-downloader
        OkHttpClient client = new OkHttpClient.Builder().build();
        Picasso picasso = new Picasso.Builder(this)
                .downloader(new OkHttp3Downloader(client))
                .build();

        Picasso.setSingletonInstance(picasso);
    }
}
