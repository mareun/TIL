Fragmentpageradpter
================
- view pager 구성되있고, 탭 클릭시 view pager의 fragment를 변경하는 형식
- fragmentpageradpter은 화면을 슬라이딩으로 전환시 한 번 생성된(화면에 보인)fragment를 계속 메모리상에 가지고 있다. 즉 이전 슬라이딩을 하면 이전에 생성된 fragment로 돌아간다.
- support library 필요

```android
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity" >

    <android.support.v4.view.ViewPager
        android:id="@+id/pager"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />

</RelativeLayout>
```

- activity 에서는 Inner Class로 Adapter 클래스를 만들고 viewpager에 어댑터 연결