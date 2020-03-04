Intent
======
- 한 Activity에서 View들에 Action을 취해 다른 Activity로 전환하는 경우 사용됨.
- Intent란 앱 컴포넌트가 무엇을 할 것인지를 담는 메시지 객체임.
- **명시적 인텐트** : 전환될 Activity를 직접 적어서 표현
- **암시적 인텐트** : 전환될 곳을 직접 지정하지 않고 Action을 적어서 사용. 전환될 곳에도 Action을 적어 Intent를 받음. 암시적 인텐트의 경우, manifest에서 Activity를 추가해준 부분에 인텐트필터를 이용.

### Parcelize
