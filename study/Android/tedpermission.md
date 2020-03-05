tedpermission
=============
- 유용한 권한체크 라이브러리

1. Gradle추가
```kt
 implementation 'gun0912.ted:tedpermission:2.1.0'
```

2. tedpermission 추가
```kt
import android.content.Context
import android.widget.Toast
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import java.util.ArrayList

class tedPermission(context1: Context){

    var context : Context = context1

    var permissionlistener : PermissionListener = object : PermissionListener{
        override fun onPermissionGranted() {
            Toast.makeText(context, "권한 허가", Toast.LENGTH_SHORT).show()
        }
        override fun onPermissionDenied(deniedPermissions: ArrayList<String>?) {
            Toast.makeText(context, "권한 거부", Toast.LENGTH_SHORT).show()
        }
        }
/************권한체크 시작****************/
    fun checkPer(){
        TedPermission.with(context)
            .setPermissionListener(permissionlistener)
            .setRationaleMessage("앱의 기능을 사용하기 위해서는 권한이 필요합니다.")
            .setDeniedMessage("[설정] > [권한] 에서 권한을 허용할 수 있습니다.")
            .setPermissions(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            android.Manifest.permission.CAMERA)
            .check()
    }
}
```

- **onPermissionGranted()** : 권한이 모두 허용 되고나서 실행.
- **onPermissionDenied()** : 요청이 권한중 거부당한 권한 목록을 리턴. 