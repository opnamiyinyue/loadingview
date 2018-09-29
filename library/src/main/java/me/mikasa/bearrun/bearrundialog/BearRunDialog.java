package me.mikasa.bearrun.bearrundialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import me.mikasa.bearrun.R;

/**
 * Created by mikasacos on 2018/9/29.
 */

public class BearRunDialog extends BaseDialog {//继承
    private BearRunView bearRunView;//组合
    public BearRunDialog(Context context){
        super(context);
    }

    @Override
    protected View getView() {
        View view= LayoutInflater.from(mContext).inflate(R.layout.layout_bear_run,null);
        bearRunView=(BearRunView)view.findViewById(R.id.iv_bear_run);
        return view;
    }

    @Override
    public void show() {
        super.show();
        bearRunView.run();
    }

    @Override
    public void dismiss() {
        bearRunView.stop();
        super.dismiss();
    }
    public void setDelayMillis(int millis){
        bearRunView.setDelayMillis(millis);
    }
    public void setRunImgIds(int ids[]){
        bearRunView.setRunImgIds(ids);
    }
}
