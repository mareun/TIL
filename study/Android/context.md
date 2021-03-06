Android Context
===============
#### Class Overview
- 어플리케이션 환경에 관한 글로벌 정보를 접근하기 위한 인터페이스. Abstract 클래스이며 실재 구현은 안드로이드 시스템에 의해 제공된다. Context 를 통해, 어플리케이션에 특화된 리소스나 클래스에 접근할 수 있을 뿐만 아니라, 추가적으로, 어플리케이션 레벨의 작업 - Activity 실행, Intent 브로드캐스팅, Intent 수신 등, 을 수행하기 위한 API 를 호출 할 수도 있다.
1. 어플리케이션에 관하여 시스템이 관리하고 있는 정보에 접근.
2. 안드로이드 시스템 서비스에서 제공하는 API를 호출 할 수 있는 기능.
- 예를 들어, Context 인터페이스가 제공하는 API들 중, **getPackageName()**, **getResource()** 등의 메서드들이 첫 번째 역할을 수행하는 대표적 메서드이다. 보통 **get** 이라는 접두어로 시작하는 메서드들.
- 그 외에, **startActivity()**나 **bindService()**와 같은 메서드들은 두 번째 역할을 수행하기 위한 메서드들임.

출처: https://arabiannight.tistory.com/entry/272 [아라비안나이트]