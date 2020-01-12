package com.bw.movie.wxapi;


import android.support.v7.app.AppCompatActivity;

import com.bw.movie.MyWXAppdID;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;

/**
 * author: 斛万珺
 * data: 2020/1/10 15:15:51
 * function:
 */
public class WXEntryActivity extends AppCompatActivity implements IWXAPIEventHandler {


    @Override
    public void onReq(BaseReq baseReq) {
        MyWXAppdID.api.handleIntent(getIntent(),this);
    }

    @Override
    public void onResp(BaseResp baseResp) {

    }
}
