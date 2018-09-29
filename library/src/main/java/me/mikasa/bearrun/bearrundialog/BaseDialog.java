package me.mikasa.bearrun.bearrundialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

/**
 * Created by mikasacos on 2018/9/29.
 */

public abstract class BaseDialog {
    protected Context mContext;
    private Display display;
    private Dialog dialog;
    protected abstract View getView();
    public BaseDialog(Context context){
        this.mContext=context;
        WindowManager manager=(WindowManager)context.getSystemService(context.WINDOW_SERVICE);
        display=manager.getDefaultDisplay();
        dialog=new Dialog(context);
        //phoneWindow
        getView().setLayoutParams(new LinearLayout.LayoutParams((int)(display.getWidth()*0.4),
                LinearLayout.LayoutParams.WRAP_CONTENT));
        dialog.setContentView(getView());//自定义view
    }
    public BaseDialog setCancellable(boolean cancellable){
        dialog.setCancelable(cancellable);
        return this;
    }
    public BaseDialog setCancelOnTouchOutside(boolean cancellable){
        dialog.setCanceledOnTouchOutside(cancellable);
        return this;
    }
    public void show(){
        dialog.show();
    }
    public void dismiss(){
        dialog.dismiss();
    }
    public boolean isShowing(){
        return dialog.isShowing();
    }
    public BaseDialog setDismissListener(DialogInterface.OnDismissListener listener){
        dialog.setOnDismissListener(listener);
        return this;
    }
}
