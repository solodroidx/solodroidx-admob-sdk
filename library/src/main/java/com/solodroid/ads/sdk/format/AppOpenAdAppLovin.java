package com.solodroid.ads.sdk.format;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.solodroid.ads.sdk.util.OnShowAdCompleteListener;

public class AppOpenAdAppLovin {

    public boolean isShowingAd = false;
    public AppOpenAdAppLovin() {
    }

    public void loadAd(Context context, String maxAppOpenAdUnitId) {

    }

    public boolean wasLoadTimeLessThanNHoursAgo(long numHours) {
        return false;
    }

    public boolean isAdAvailable() {
        return false;
    }

    public void showAdIfAvailable(@NonNull final Activity activity, String appOpenAdUnitId) {
        showAdIfAvailable(activity, appOpenAdUnitId, () -> {
        });
    }

    public void showAdIfAvailable(@NonNull final Activity activity, String appOpenAdUnitId, @NonNull OnShowAdCompleteListener onShowAdCompleteListener) {
        if (!isAdAvailable()) {
            return;
        }
    }

}