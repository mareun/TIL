Fragment
========
- Fragment는 Activity내 화면 UI의 일부를 나타냄.
- 여러 개의 Fragment를 조합하여 Activity가 출력하는 한 화면 UI를 표현할 수 있음.
- 하나의 Fragment를 다른 Activity에 재사용 가능.
- Activity처럼 하나의 독립된 모듈처럼 실행되기 때문에 Activity와 연관된 생명주기를 가지고 있음.
- Activity 실행 중에도 화면에 동적으로 추가되거나 다른 Fragment로 교체가 가능.
- 기본적으로 한 개의 Activity에 들어가는 화면 요소를 Fragment 단위로 나누어 관리하기 때문에 layout을 분리하여 관리 가능.layout의 복잡도 줄임.

![image](https://user-images.githubusercontent.com/44865268/74802839-50539280-531e-11ea-97ae-9672437b0021.png)

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