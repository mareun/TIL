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
        //스페이스바르 누르면 gameObject가 사라짐.
        {
            Destroy(gameObject); //즉시
            //Destroy(gameObjcet, 3f); //3초뒤에 사라짐.
        }
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
        }//GetComponent로 컴포넌트를 참조
        //여기서는 MeshRenderer라는 컴포넌트를 제거
        //그러면 오브젝트가 더 이상 시각적으로 렌더링되지 않는다.
    }
}
```
- 전체 게임 오브젝트가 아닌 컴포넌트만 제거할 수 있다.