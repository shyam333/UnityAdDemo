package com.magicbox.unityaddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;

public class MainActivity extends AppCompatActivity implements IUnityAdsListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UnityAds.initialize(this,"2776300",this);

        if(UnityAds.isReady())
        {
            UnityAds.show(this);
        }
    }

    @Override
    public void onUnityAdsReady(String s) {

        if(UnityAds.isReady())
        {
            UnityAds.show(this);
        }
    }

    @Override
    public void onUnityAdsStart(String s) {

    }

    @Override
    public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

    }

    @Override
    public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

    }


}
