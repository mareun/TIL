GetAxis
=========
- Input.GetAxis는 GetButton, GetKey와 유사한 방식으로 작용
- GetButton과 GetKey는 버튼을 누르거나 누르지 않아도 bool을 반환한다.
- GetAxis는 -1과 1사이의 부동값을 반환
- 축 설정: Edit -> Project Settings -> Input
- 여기서는 버튼을 누를 때 양의 값만을 고려하지만 축은 양과 음의 값 둘다 고려함.
- Gravity, Dead, Sensitivity, Snap 도 함께 고려.

> Gravity : 버튼 릴리즈 후 Scale이 0으로 복귀하는 속도에 영향 \
Sensitivity : Gravity와 반대로 입력의 반환값이 1이나 -1에 도달하는 속도에 옇향\
숫자가 클수록 반응성이 높다.\
Dead : 값이 높을수록 데드 영역은 넓어진다. (예: 조이스틱의 미세한 움직임 무시)\
Snap : 음과 양의 버튼이 hold인 경우, 0을 반환할 수 있다.
***

### AxisExample
```c#
using UnityEngine;
using System.Collections;

public class AxisExample : MonoBehaviour
{
    public float range;
    public GUIText textOutput;
    
    
    void Update () 
    {
        float h = Input.GetAxis("Horizontal");
        float xPos = h * range;
        
        transform.position = new Vector3(xPos, 2f, 0);
        textOutput.text = "Value Returned: "+h.ToString("F2");  
    }
}
```

***

### AxisRawExample
```c#
using UnityEngine;
using System.Collections;

public class AxisRawExample : MonoBehaviour
{
    public float range;
    public GUIText textOutput;
    
    
    void Update () 
    {
        float h = Input.GetAxisRaw("Horizontal");
        float xPos = h * range;
        
        transform.position = new Vector3(xPos, 2f, 0);
        textOutput.text = "Value Returned: "+h.ToString("F2");  
    }
}
```

***
### DualAxisExample
```c#
using UnityEngine;
using System.Collections;

public class DualAxisExample : MonoBehaviour 
{
    public float range;
    public GUIText textOutput;
    
    
    void Update () 
    {
        float h = Input.GetAxis("Horizontal");
        float v = Input.GetAxis("Vertical");
        float xPos = h * range;
        float yPos = v * range;
        
        transform.position = new Vector3(xPos, yPos, 0);
        textOutput.text = "Horizontal Value Returned: "+h.ToString("F2")+"\nVertical Value Returned: "+v.ToString("F2");    
    }
}
```

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/getaxis?playlist=17117)