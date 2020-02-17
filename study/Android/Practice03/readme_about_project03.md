about practice03
============
- 탭 클릭시 viewpager의 fragment를 변경하는 형식
![image](https://user-images.githubusercontent.com/44865268/74635075-94248b80-51a8-11ea-9133-63109bfa13e8.png)

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
