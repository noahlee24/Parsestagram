
package com.example.parsestagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1Vqj6zIuwufMaHvNXwQLZ1KZuwp1YYrrwVHESY2P")
                .clientKey("uqWyN2hPJmczKONmeI6mpSskU5FHf50yaeHgCMYv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
