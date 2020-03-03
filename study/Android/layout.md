Layout
=======
### Layout종류
출처: https://m.blog.naver.com/PostView.nhn?blogId=justkukaro&logNo=221010150133&proxyReferer=https%3A%2F%2Fwww.google.com%2F
### ConstraintLayout
```xml
<androidx.constraintlayout.widget.ConstraintLayout ...>
    <Button android:id="@+id/buttonA" ... />
    <Button android:id="@+id/buttonB" ...
            app:layout_constraintLeft_toRightOf="@+id/buttonA" />
</androidx.constraintlayout.widget.ConstraintLayout>
```
- buttonB의 왼쪽편을 buttonA의 오른쪽에 배치.
출처: https://www.charlezz.com/?p=669

---
#### practice03의 item_boder.xml
```kt
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape
            android:shape="rectangle">
            <stroke
                android:width="0.5dp"
                android:color="#8f8f8f" />
        </shape>
    </item>
</selector>
```
- 다음과 같이 drawable에 디자인 xml을 추가하면 다른 xml에서 요긴하게 쓰일 수 있다.
- 하지만 이 디자인은 굳이 이렇게 안하고 **CareView** 를 이용하면 된다.