package me.mikasa.bearrunning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import me.mikasa.bearrunning.R;
import me.mikasa.bearrun.bearrundialog.BearRunDialog;

public class MainActivity extends AppCompatActivity {
    private long firstTime;
    private BearRunDialog dialog;
    private int[]imgIds={R.mipmap.bear1,R.mipmap.bear2,R.mipmap.bear3,R.mipmap.bear4,
                         R.mipmap.bear5,R.mipmap.bear6,R.mipmap.bear7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear_running);
        initViews();
    }
    private void initViews(){
        dialog=new BearRunDialog(this);
        dialog.setRunImgIds(imgIds);//gif的图片集
        //dialog.setDelayMillis(60);//默认60毫秒,gif的时间间隔
        dialog.setCancelOnTouchOutside(true);
    }
    private void showDialog(){
        dialog.show();
    }
    private void dismissDialog(){
        dialog.dismiss();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.show_dialog:
                showDialog();
                return true;
            case R.id.dismiss_dialog:
                dismissDialog();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        long secondTime=System.currentTimeMillis();
        if (secondTime-firstTime>2000){
            Toast.makeText(this,"再按一次退出程序",Toast.LENGTH_SHORT).show();
            firstTime=secondTime;
        }else {
            finish();
        }
    }
}
