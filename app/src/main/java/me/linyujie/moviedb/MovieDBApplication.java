package me.linyujie.moviedb;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by linyujie on 8/5/17.
 */

public class MovieDBApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
