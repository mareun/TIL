Translate and Rotate
=====================
- GameObject의 위치와 회전 변경에 사용하는 함수


```c#
using UnityEngine;
using System.Collections;

public class TransformFunctions : MonoBehaviour
{
    public float moveSpeed = 10f; //움직이는 속도
    public float turnSpeed = 50f; //회전속도
    //이런식으로 변수를 이용해 값을 지정해주면
    //따로 스크립트 창으로 들어가지 않아도 값을 바꿀 수 있다.
    //용이하다.

    
    void Update () //키보드에서 방향키를 입력받을 때 object움직임.
    {
        //Translate
        if(Input.GetKey(KeyCode.UpArrow)) //방향키 위
            transform.Translate(Vector3.forward * moveSpeed * Time.deltaTime);
            //Vector3.forward는 z축이동
        
        if(Input.GetKey(KeyCode.DownArrow)) //방향키 아래
            transform.Translate(-Vector3.forward * moveSpeed * Time.deltaTime); //-으로 방향을 반대로 전환
        
        //Rotate
        if(Input.GetKey(KeyCode.LeftArrow)) //방향키 왼쪽
            transform.Rotate(Vector3.up, -turnSpeed * Time.deltaTime);
            //Vector3.up은 축에 해당
        
        if(Input.GetKey(KeyCode.RightArrow)) //방향키 오른쪽
            transform.Rotate(Vector3.up, turnSpeed * Time.deltaTime);
    }
}
```

- 여기 적용된 함수들은 world축이 아닌 local축에 적용된다. 즉 적용되는 축에 대해 상대적이다.
- 물리와 상호작용을 하는 오브젝트는 이러한 함수를 사용하지 않아야 한다.

출처 : (https://unity3d.com/kr/learn/tutorials/topics/scripting/translate-and-rotate?playlist=17117)