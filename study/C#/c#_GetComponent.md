GetComponent
============
- Unity에서 Script는 사용자 지정 Component로 간주된다.
- 동일한 게임 오브젝트나 다른 게임 오브젝트에 첨부된 Script를이용해야 하는 경우가 있다. Getcomponent를 통해 다른 Script 및 Component를 이용할 수 있다.
- GetComponent는 처리 능력에서 보면 비용이 많이 소요되므로 호출 횟수를 최대한 줄여야 한다.\
Awake나 Start함수에서 호출하거나 처음 필요할 때 1회만 호출하는 것이 좋다.

* * *

### UsingOtherComponents
```c#
using UnityEngine;
using System.Collections;

public class UsingOtherComponents : MonoBehaviour
{
    public GameObject otherGameObject;
    //게임 오브젝트
    
    private AnotherScript anotherScript;
    private YetAnotherScript yetAnotherScript;
    private BoxCollider boxCol;
    //Script를 reference하여 address가능하게 한다.
    //실제로 참조하고 있는 것은 Script에 정의된 class의 instance이다.
    
    
    void Awake ()
    {
        //선형괄호 <>를 사용, <>안에는 type을 parameter로 사용
        anotherScript = GetComponent<AnotherScript>();
        yetAnotherScript = otherGameObject.GetComponent<YetAnotherScript>();
        //다른 게임 오브젝트의 Component를 address
        boxCol = otherGameObject.GetComponent<BoxCollider>();
        //박스형 충돌체의 속성을 사용한다.
    }
    
    
    void Start ()
    {
        boxCol.size = new Vector3(3,3,3);
        //OhterGameObject의 해당 component에 대한 모든 parameter에 address가 가능하다.
        //여기 예시로는 Scene이 시작하면 size에 address해서 3으로 설정한다.
        Debug.Log("The player's score is " + anotherScript.playerScore);
        Debug.Log("The player has died " + yetAnotherScript.numberOfPlayerDeaths + " times");
    }
}
```
### AnotherScript
- UsingOtherCompononets와 동일한 object에 있는 Script
- GetComponent
```c#
using UnityEngine;
using System.Collections;

public class AnotherScript : MonoBehaviour
{
    public int playerScore = 9001;
}
```

### YetAnotherScript
- 다른 object에 있는 Script
- otherGameObject.GetComponent
```c#
using UnityEngine;
using System.Collections;

public class YetAnotherScript : MonoBehaviour
{
    public int numberOfPlayerDeaths = 3;
}
```

> 다른 Script 접근에 GetComponent를 사용하는 것이 가장 일반적이다.
> API를 통해 노출되지 않은 다른 component 접근에도 사용한다. (ex. Collider, 구형 충돌체와 박스형 충돌체의 다른 속성)
