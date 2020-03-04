about practice04
=======
### Parcelize를 이용한 intent로 데이터 전달
출처(https://www.youtube.com/watch?v=6EGDoDv5Ge8)

---
## Parcelable와 Serializable
- 안드로이드 컴포넌트나 Fragment간에 클래스로 데이터를 주고 받을 때 **Serializable, Parcelable**을 구현해야 함.
- **Serializable** : Java의 표준 인터페이스. 구현이 간편
- **Parcelable** : Android SDK의 인터페이스. Serializable보다 빠르고 android에서 사용하기를 권장함.

## Parcelize
- Serializable의 구현하기 쉬운 장점과 Parcelable의 성능상 이점을 모두 가질 수 있음.

```kt
/******bulid.gradle******/
apply plugin: 'com.android.application'

apply plugin: 'kotlin-android'

apply plugin: 'kotlin-android-extensions'

android {
    ...
  androidExtensions{
        experimental = true
    }
}

/*****Product.kt******/
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val name: String,
    val price: String,
    val score: String,
    val photo: Int
) : Parcelable
```
- 위와 같이 bulid.gradle에 추가해주고 @Parcelize만 써주면 끝. 이때 parcelable의 필수메서드들의 구현 코드는 자동으로 생성됨.
