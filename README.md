# android-java
[2019-11-13]

1. 建立 Android 單一頁專案, 得到佈局檔與 Activity
  
  1.1 AndroidManifest.xml
  1.1.1 記錄有哪些可跳轉的頁面 activity 
  1.1.2 可指定初始頁, 啟動icon, 啟動頁等
  
  1.2 MainActivity
  1.2.1 可想成 Container 可以進行跳轉的頁面
  1.2.2 搭配一個佈局文件 xml 檔, 可放置標籤元件(類似RN元件), 但只能佈局不能寫邏輯
  1.2.3 xml 裡的可視元件可以定義 id 後, 就可以再 activity 裡取得 instance 進行邏輯控制
  1.2.4 頁面跳轉可透過
  
  1.3 佈局檔（XML)
  1.3.1 兩大佈局系統, 線性佈局(LinearLayout)/相對佈局(RelativeLayout) 可互相嵌套
  1.3.2 可視物件寬高為必要屬性, 可適配內容物(wrap_content)或適配父元件(match_parent)
  
  1.4 R class (重要)
  1.4.1 aapt (Android Asset Packaging Tool) 創建
  1.4.2 佈局檔裡的可視物件都可以定義 id, 在 Activity 中可以 R.id.objName(系統中變成一個編號)取得該物件
  1.4.3 取 layout 指定進某一個 Activity, 可以用 R.layout.xxx (xxx 是一個佈局檔無須 import, 在 res/layout 下的 xxx.xml)
  1.4.4 在 xml 中可以直接引用 value 下的常數定義, 比如 @color, @string, @style
  
  1.5 可視物件點擊事件註冊
  1.5.1 viewObj.setOnClickListener(param) 淺顯易懂
  1.5.2 param 為一個抽象類別(interface) View.OnClickListener 的實例化, 需要實做 onClick(View v), 系統會幫忙把點到的 view 丟進來
  1.5.3 實例化可以 new 完後立刻接實例化實作, 比如: new View.OnClickListener() {
            @Override
            public void onClick(View v) {...}
  
  1.6 
  
