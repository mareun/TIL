GetButton and GetKey
====================

### ButtonInput
- edit -> project setting -> input

![image](https://user-images.githubusercontent.com/44865268/51251954-e0b5fa00-19dd-11e9-96f5-6ff831f543be.png)


```c#
using UnityEngine;
using System.Collections;

public class ButtonInput : MonoBehaviour
{
    public GUITexture graphic;
    public Texture2D standard;
    public Texture2D downgfx;
    public Texture2D upgfx;
    public Texture2D heldgfx;
    
    void Start()
    {
        graphic.texture = standard;
    }
    
    void Update ()
    {
        bool down = Input.GetButtonDown("Jump");
        bool held = Input.GetButton("Jump");
        bool up = Input.GetButtonUp("Jump");
        //reference name is jump
        
        if(down)
        {
            graphic.texture = downgfx;
        }
        else if(held)
        {
            graphic.texture = heldgfx;
        }
        else if(up)
        {
            graphic.texture = upgfx;
        }
        else
        {
            graphic.texture = standard;
        }
    
        guiText.text = " " + down + "\n " + held + "\n " + up;
    }
}
```
![image](https://user-images.githubusercontent.com/44865268/51252436-28895100-19df-11e9-9963-9ca696fa0a63.png)

1. 아무동작도 하지 않음: default 는 False
2. 버튼을 눌를 때
3. 버튼을 누르는 힘?이 없을 때 (버튼은 눌러져 있는 상태)
4. 버튼이 올라갈 때

***

### KeyInput
```c#
using UnityEngine;
using System.Collections;

public class KeyInput : MonoBehaviour
{
    public GUITexture graphic;
    public Texture2D standard;
    public Texture2D downgfx;
    public Texture2D upgfx;
    public Texture2D heldgfx;
    
    void Start()
    {
        graphic.texture = standard;
    }
    
    void Update ()
    {
        bool down = Input.GetKeyDown(KeyCode.Space);
        bool held = Input.GetKey(KeyCode.Space);
        bool up = Input.GetKeyUp(KeyCode.Space);
        //KeyCode 사용
        
        if(down)
        {
            graphic.texture = downgfx;
        }
        else if(held)
        {
            graphic.texture = heldgfx;
        }
        else if(up)
        {
            graphic.texture = upgfx;
        }
        else
        {
            graphic.texture = standard; 
        }
        
        guiText.text = " " + down + "\n " + held + "\n " + up;
    }
}
```
![image](https://user-images.githubusercontent.com/44865268/51252865-42776380-19e0-11e9-8d99-31bac99bec58.png)

- GetButton과 동일