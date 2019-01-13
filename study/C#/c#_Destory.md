Destroy
=======
- Destroy함수를 이요하면 runtime 도중 GameObject나 Component를 제거할 수 있다.

- Destroy(GameObject / Component, optional delay);
- 두번째 파라미터 시간 지연으로도 같은 작업을 수행할 수 있다.

- Script가 첨부된 GameObject를 참조하면 된다.

***

### DestroyBasic
```c#
using UnityEngine;
using System.Collections;

public class DestroyBasic : MonoBehaviour
{
    void Update ()
    {
        if(Input.GetKey(KeyCode.Space))
        {
            Destroy(gameObject);
        }//스페이스바르 누르면 gameObject가 사라짐.
    }

```
- 이 방식으로하게 되면 첨부된 스크립트 컴포넌트도 사라진다.

***
### DestroyOther
```c#
using UnityEngine;
using System.Collections;

public class DestroyOther : MonoBehaviour
{
    public GameObject other;
    //또 다른 오브젝트 참조를 이용
    //공개 변수로 설정하여 또 다른 변수를 참조한다.
    
    void Update ()
    {
        if(Input.GetKey(KeyCode.Space))
        {
            Destroy(other);
        }
    }
}
```
- 인스펙터에서 사용할 것을 드래그

***
### DestroyComponent
```c#
using UnityEngine;
using System.Collections;

public class DestroyComponent : MonoBehaviour
{
    void Update ()
    {
        if(Input.GetKey(KeyCode.Space))
        {
            Destroy(GetComponent<MeshRenderer>());
        }
    }
}
```