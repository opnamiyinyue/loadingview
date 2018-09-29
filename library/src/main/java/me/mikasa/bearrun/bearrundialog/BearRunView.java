package me.mikasa.bearrun.bearrundialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import me.mikasa.bearrun.R;

/**
 * Created by mikasacos on 2018/9/29.
 */

public class BearRunView extends AppCompatImageView {
    private Context mContext;
    private int runImageId;
    private int[] runImgIds;
    private static int pos=0;
    private int delayMillis=50;
    private static Handler handler=new Handler();
    private boolean isRunning=false;
    public BearRunView(Context context){
        super(context,null);
    }
    public BearRunView(Context context, AttributeSet attrs){
        super(context, attrs,0);
    }
    public BearRunView(Context context,AttributeSet attrs,int defStyleAttr){
        super(context, attrs, defStyleAttr);
        mContext=context;
        TypedArray ta=context.obtainStyledAttributes(attrs,R.styleable.BearRunView);
        initAttrs(ta);
        ta.recycle();
        checkValues();//检查值是否合法
    }
    private void initAttrs(TypedArray ta){
        runImageId=ta.getResourceId(R.styleable.BearRunView_src,-1);
    }
    private void checkValues(){
        if (runImageId==-1){
            throw new IllegalStateException("您还没有设置默认状态下的图标，请指定iconNormal的图标");
        }
    }
    public void setRunImgIds(int[] ids){
        this.runImgIds=ids;
    }
    public void stop(){
        isRunning=false;
    }
    public void run(){
        isRunning=true;
        bearRun();
    }

    private void bearRun(){
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (isRunning){
                    pos++;
                    if (pos==runImgIds.length-1){
                        pos=0;
                    }
                    //setImageDrawable(ContextCompat.getDrawable(mContext,imgIds[pos]));
                    setImageResource(runImgIds[pos]);
                    handler.postDelayed(this,delayMillis);
                }else {
                    handler.removeCallbacks(this);
                }
            }
        });
    }
    public void setDelayMillis(int millis){
        this.delayMillis=millis;
    }
    public boolean isShowing(){
        return isRunning;
    }
}
