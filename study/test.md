vr 개요
========
* VR은 컴퓨터로 만들어 놓은 가상의 세계에 사람이 실제와 거의 같은 체험을 하게하는 기술이다.
* 사람의 오른쪽과 왼쪽 눈에 각 카메라를 두어서 서로 다른 영상을 렌더링 시키면, 사람의 뇌가 공간감적인 인식을 하여 입체적인 화면으로 느끼게 한다.
* 머리의 움직임으로 시야를 이동시킬 수 있으며, 대게 핸드 헬드 컨트롤러로 가상세계와 상호작용을 한다.
* 현재는 아직 VR로 이용한 컨텐츠가 많이 없으며, VR이용시, 어지럼증과 멀미가 있어서 계속 발전해가는 중이다.
* VR을 개발하기 위한 엔진은 여러가지가 있는 것 같지만, 그 중에서 unity엔진을 이용할 것 같다. 이때 언어는 C#을 쓴다.


3D Graphics
===========
간단한 3D 그래픽스에 관하여!

* 대게 우리가 보는 컴퓨터 화면은 2차원이다. 이 말은 즉슨 화면의 그림은 수많은 x와 y축의 값의 점으로 표현한다.
* VR에서의 3차원 그림은 수많은 면으로 그려진다. 이 때에 z축이 필요하게 된다.



### < 용어 정리 >
> **'폴리곤(Polygon)'** :  3차원에서 그려지는 수많은 각각의 면들\
**'트라이앵글(Triangle)'** : 폴리곤은 대부분 삼각형으로 만들어지는데 이를 트라이앵글이라고 불린다.\
**'모델링(Modeling)'** : 어떤 물체의 3차원적인 모습을 수치 데이터로 표현하는 것.\
**'렌더링(Rendering)'** : 3차원으로 그려진 모델링 데이터를 모니터 화면에 보여주기 위해서 2차원으로 그려주는 것.\
모니터는 2차원 출력장치이므로 꼭 필요한 과정이다. \
**'텍스처 매핑(Texture Mapping)'** : 3D 그래픽 속의 2D 그림. 예를 들어 사람이 들고 있는 사진, 하늘에 구름이 떠 있는 광경 등의 3차원 그래픽을 사용할 필요가 없는 것들을 의미.
