Activating GameObjects
======================
- Scripting을 통해 Object를 활성화 또는 비활성화하려면 'SetActivate'함수를 사용.

```c#
using UnityEngine;
using System.Collections;

public class ActiveObjects : MonoBehaviour
{
    void Start ()
    {
        gameObject.SetActive(false);
    }
}
```
- play 버튼을 누르면 오브젝트는 비활성화된다.
- 오브젝트를 계층으로 작업할 때는 부모 오브젝트의 비활성화 가능 여부를 확인해야 한다.
- 자식이 비활성화여도 계층은 활성화 상태를 유지 -> 개별 오브젝트를 사용하지는 않지만 부모 오브젝트를 사용하는 자식 오브젝트 그룹을 계속 제어하기 위함.
- 대신 부모 오브젝트를 비활성화 하면 자식 오브젝트가 모두 비활성화 된다. 그러나 계층 내에서는 활성화 상태를 유지.

```c#
using UnityEngine;
using System.Collections;

public class CheckState : MonoBehaviour
{
    public GameObject myObject;
    
    
    void Start ()
    {
        Debug.Log("Active Self: " + myObject.activeSelf);
        Debug.Log("Active in Hierarchy" + myObject.activeInHierarchy);
    }
}
```
- 'activeSelf'와 'activeInHierarchy'를 통해 오브젝트가 장면이나 계층 내에서 활성화 상태인지 확인한다.
- 부모 오브젝트 활성화 : Active Self: true , Active in Hierarchy: true
- 부모 오브젝트 비활성화 : Active Self: true , Active in Hierarchy: false\
Scene에서 활성화 되지 않는다. (보이지 않는다.)
