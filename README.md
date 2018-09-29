# loadingview
loading custom 自定义loadingview 有趣好玩的loadingview 百度熊  

用七张百度熊图片做成的一个gif动画  
  
<img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear1.png"/><img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear2.png"/><img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear3.png"/><img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear4.png"/><img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear5.png"/><img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear6.png"/><img src="https://github.com/sanlisanlisanli/loadingview/blob/master/app/src/main/res/mipmap-mdpi/bear7.png"/>  
  
用自定义dialog的方式集成的一个百度熊loadingview，非常有趣可爱  
   
调用非常简单  
  
首先定义GIF的图片集，可以替换bear图片为你想要做成的GIF图,数量不限    
private int[]imgIds={R.mipmap.bear1,R.mipmap.bear2,R.mipmap.bear3,R.mipmap.bear4,
                         R.mipmap.bear5,R.mipmap.bear6,R.mipmap.bear7};   
                         
然后调用BearRunDialog  
  
BearRunDialog dialog=new BearRunDialog(context);
   
dialog.setRunImgIds(imgIds);//gif的图片集  
  
   
//dialog.setDelayMillis(50);//可以不设置，默认50毫秒,gif的时间间隔  
  
最后通过dialog.show()和dialog.dismiss()来控制loadingview的显示和隐藏  
  
<img src="https://github.com/sanlisanlisanli/loadingview/blob/master/screenshots/Screenshot_20180929-194906.jpg" width="200"  height="300"/>  
<img src="https://github.com/sanlisanlisanli/loadingview/blob/master/screenshots/Screenshot_20180929-194911.jpg" width="200"  height="300"/>  
<img src="https://github.com/sanlisanlisanli/loadingview/blob/master/screenshots/Screenshot_20180929-195644.jpg" width="200"  height="300"/>  
  
如果能帮助到你，欢迎star，你的喜欢是我最大的动力  

拥抱开源  

  
  



