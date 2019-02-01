Switch Statements
=================

- 조건문 switch문
- 예시: Enumeration에 기초한 의사결정(캐릭터의 의사소통이 지능단계에 의거하여 달라진다는 코드)

```c#
using UnityEngine;
using System.Collections;

public class ConversationScript : MonoBehaviour 
{
    public int intelligence = 5;
    
    
    void Greet()
    {
        switch (intelligence) //switch구문(항상 보던 구조!)
        {
        case 5:
            print ("Why hello there good sir! Let me teach you about Trigonometry!");
            break;
        case 4:
            print ("Hello and good day!");
            break;
        case 3:
            print ("Whadya want?");
            break;
        case 2:
            print ("Grog SMASH!");
            break;
        case 1:
            print ("Ulg, glib, Pblblblblb");
            break;
        default:
            print ("Incorrect intelligence level.");
            break;
        }
    }
}
```

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/switch-statements?playlist=17117)
