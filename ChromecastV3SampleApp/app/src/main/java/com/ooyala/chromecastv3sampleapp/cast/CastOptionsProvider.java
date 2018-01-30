
package com.ooyala.chromecastv3sampleapp.cast;

import android.content.Context;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.ooyala.chromecastv3sampleapp.R;

import java.util.List;


/**
 * Don't delete this class. It is used to provide google cast options by manifest.
 */
public class CastOptionsProvider implements OptionsProvider {
    private final String NAMESPACE = "urn:x-cast:ooyala";
    private final String APP_ID = "4172C76F";
    private final String APP_ID_SAMPLE = "4F8B3483";

    @Override
    public CastOptions getCastOptions(Context context) {
        NotificationOptions notificationOptions = new NotificationOptions.Builder()
                .build();
        CastMediaOptions mediaOptions = new CastMediaOptions.Builder()
                .setNotificationOptions(notificationOptions)
                .build();

        return new CastOptions.Builder()
                .setReceiverApplicationId(APP_ID)
                .setCastMediaOptions(mediaOptions)
                .build();
    }
    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }
}