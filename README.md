##android-java

#### [2019-11-13]

##### 建立 Android 單一頁專案, 得到佈局檔與 Activity

###### 	AndroidManifest.xml
	記錄有哪些可跳轉的頁面 activity
	可指定初始頁, 啟動icon, 啟動頁等

###### 	MainActivity
	可想成 Container 可以進行跳轉的頁面
	搭配一個佈局文件 xml 檔, 可放置標籤元件(類似RN元件), 但只能佈局不能寫邏輯
	xml 裡的可視元件可以定義 id 後, 就可以再 activity 裡取得 instance 進行邏輯控制
	頁面跳轉可透過 class Intent

##### 佈局檔（XML)
	兩大佈局系統, 線性佈局(LinearLayout) / 相對佈局(RelativeLayout) 可互相嵌套
	可視物件寬高為必要屬性, 可適配內容物(wrap_content)或適配父元件(match_parent)

##### R class (重要)
	aapt (Android Asset Packaging Tool) 創建 
	佈局檔裡的可視物件都可以定義 id, 在 Activity 中可以 R.id.objName(系統中變成一個編號)取得該物件
	取 layout 指定進某一個 Activity, 可以用 R.layout.xxx (xxx 是一個佈局檔無須 import, 在 res/layout 下的 xxx.xml)
	在 xml 中可以直接引用 value 下的常數定義, 比如 @color, @string, @style

##### 可視物件點擊事件註冊
	viewObj.setOnClickListener(param) 淺顯易懂 
	param 為一個 interface View.OnClickListener 的實例化, 需要實做 onClick(View v), 系統會幫忙把點到的 view 丟進來 
	實例化也可以 new 完後立刻接實作, 比如: new View.OnClickListener() { @Override public void onClick(View v) {...}

##### List View 物件(內建基本元件, 可以被 recyclerView 取代)
	實作佈局 Adapter extend BaseAdapter(系統的)
	Adapter, 需配置兩個參數 : Context(運行中的activity本身, 不傳好像也沒差), LayoutInflater(從運行中的 context form 出來, 動態加載 layout 用的)
	Adapter, 至少需要實作 getCount(): 回傳陣列個數(先隨意回一個常數), getView(): 實作 item 佈局與綁定變量 
	getView(): 先長出一個 view(佈局先寫好), 綁定變量, 若綁定過, 直接取出做修改, 最後把綁好的 view 返回
	回到 activity 把 Adapter 設定給 listView 用就搞定了 
	實作 list item 點擊事件 
	ListView 自帶點擊事件, 參數為 AdapterView.OnItemClickListener , 實現方法與 View.OnClickListener 類似, 就差被塞入的參數不同

##### RecyclerView

