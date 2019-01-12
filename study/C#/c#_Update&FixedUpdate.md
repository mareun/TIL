Update and FixedUpdate
=======================

### Update()
> 1. Called Every Frame
> 2. Used for regular updates such as:\
Moving Non-Physics objects\
Simple Timers\
Receiving Input
> 3. Update interval times vary

- update를 사용하는 모든 스크립트에서 프레임당 1회 호출된다.
- 정기적인 변경이나 조정이 필요한 거의 모든 작업이 여기서 수행된다.\
**(update는 규칙적인 시간 간격으로 호출되지 않는다.)**
- **프레임 처리 시간이 다음 프레임보다 길면 업데이트 호출 사이의 시간이 다르다.**

***

### FixedUpdate()
> 1. Called Every Physics Step
> 2. Fixed Update intervals are consistent
> 3. Used for regular updates such as:\
Adjusting Physics(Rigidbody)objects

- **fixedupdate는 규칙적인 시간 간격으로 호출된다.**
- **호출 사이의 시간이 같다.**
- fixedupdate가 호출된 직후 필요한 모든 물리 계산이 수행된다.
- 즉, 물리 오브젝트에(Rigidbody)영향을 주는 것은 update보다는 fixedupdate에서 실행해야 한다.
- fixed update에서 Physics 스크립트를 작성할 때는 움직임에 적합한 힘을 이용한다.

***
### Update()와 FixedUpdate() 차이점

```c#
using UnityEngine;
using System.Collections;

public class UpdateAndFixedUpdate : MonoBehaviour
{
    void FixedUpdate ()
    {
        Debug.Log("FixedUpdate time :" + Time.deltaTime);
    }
    
    
    void Update ()
    {
        Debug.Log("Update time :" + Time.deltaTime);
    }
}
```
- 호출시간의 차이

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/update-and-fixedupdate?playlist=17117)
