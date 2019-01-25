출처: (https://unity3d.com/kr/learn/tutorials/topics/graphics/introduction-lighting-and-rendering?playlist=17102)


Introduction to Lighting and Rendering
====================================


### How GI works in Unity.
- GI : Global illumination
- 빛의 복잡한 행동을 simulate한다. global iluumination을 정확하게 simulate하는 것은 어렵고 계산이 무겁다. 때문에 play중보다는 계산을 미리 처리하는 접근법을 사용한다.

다음은 같은 scene들이다.
![image](https://user-images.githubusercontent.com/44865268/51679566-9c041180-2022-11e9-91d2-f0b9e707c7f7.png)
1. with no lighting
2. with direct light only Center
3. with indirect global illumination
- 색상이 표면사이에 bounces되어 훨씬 더 사실적인 결과를 제공한다.
- light를 모든 범위에서 baking할 때는 비용이 비싸서 미리 baking하거나 수치를 줄이는 방법이 있다.