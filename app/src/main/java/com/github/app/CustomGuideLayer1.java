package com.github.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.github.easyguide.AbsGuideLayer;
import com.github.easyguide.RelativeGuideLayer;

/**
 * Created by shenxl on 2018/8/16.
 */

public class CustomGuideLayer1 extends RelativeGuideLayer {
    @Override
    protected View onCreateView(Context context){
        return LayoutInflater.from(context).inflate(R.layout.leading_1, null);
    }

    @Override
    protected AbsGuideLayer nextLayer() {
        return null;
    }
}