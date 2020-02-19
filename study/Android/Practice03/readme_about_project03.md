about practice03
============
- 탭 클릭시 viewpager의 fragment를 변경하는 형식
![image](https://user-images.githubusercontent.com/44865268/74635075-94248b80-51a8-11ea-9133-63109bfa13e8.png)
- EditText이용, intent이용해 다른 activity에 값 전달하기&activity 화면전환
- RecyclerView이용. (fragment위에)
![image](https://user-images.githubusercontent.com/44865268/74825958-1bf7ca80-534e-11ea-9b4b-73b4d80ac3e5.png)
출처(https://androidyongyong.tistory.com/5)
- LayoutManager를 이용하여 item을 위치시키고, item 삭제나 생성과 같은 operation에 animation효과를 줌.

***
### Study
#### EditText
> EditText
- Text를 입력 및 수정 가능한 View 위젯
```xml
<EditText
    android:id="@+id/sample_EditText"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    android:ems="10"
    android:inputType="textPersonName"
    android:text="Sample EditText" />

    <!--android:text="editable = true"-->

```
![image](https://user-images.githubusercontent.com/44865268/74804868-d70b6e00-5324-11ea-876a-3075fa048f97.png)

- **android:text="Sample EditText"** : 초기 실행 시점 text영역에 나타나는 text. EditText를 클릭하고 Text를 입력하는 순간 사라짐.
- **android:text="editable = true"** : enabled속성 사용시 EditText에 텍스트를 입력 및 수정이 불가능한 상태로 설정 할 수 있음. **true**는 사용가능한 상태. **false**는 사용불가능한 상태.
![image](https://user-images.githubusercontent.com/44865268/74805050-6dd82a80-5325-11ea-9315-1594f1a69dc7.png)

> EditText 속성
1. **hint** : EditText배경에 속성값으로 지정한 문자열을 나타나게 함.
2. **textColorHint** : hint속성에 의해 지정된 문자열 색상 지정.
```xml
<EditText
    android:hint="아이디를 입력하세요"
    android:textColorHInt="@color/colorAccent"/>
```
3. **selectAllOnFocus** : EditText 클릭시 텍스트 영역을 전체 선택된 상태로 만들고자 할 때 사용.
4. **textColorHighlight** : EditText에서 Text에 해당하는 사각형 영역을 표현할 때 사용.
```xml
<EditText
    android:selectAllOnFocus="true"
    android:textColorHighlight="@color/colorPrimary"/>
```
5. **maxLength** : EditText에 입력 가능한 Text 수를 지정.
```xml
<EditText
    android:maxLength="5"/>
```

출처 : (https://lktprogrammer.tistory.com/138)
***
### 오류해결
```kt
override fun getItem(position: Int): Fragment?
//불가능
 @NonNull
    public abstract Fragment getItem(int position);
//nullable하지 않기 때문에 null반환은 안됨. 
//대신 예외처리로 해결한다.
//해결: ?지우기
```

```kt
class MainAdapter (var fragNum : Int, fm : FragmentManager) : FragmentStatePagerAdapter(fm) {...}
//불가능
   @Deprecated
    public FragmentStatePagerAdapter(@NonNull FragmentManager fm) {
        this(fm, BEHAVIOR_SET_USER_VISIBLE_HINT);
    }
//deprecated 이기에 BEHAVIOR_SET_USER_VISIBLE_HINT이 아닌
//BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT를 사용해줘야 한다.
//해결

class MainAdapter (var fragNum : Int, fm : FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {...}

```
- build.gradle 에 implementation을 추가 할 때 버전확인 잘해야 함. com.~이 아니라 androidx.~으로 찾아서 넣기
