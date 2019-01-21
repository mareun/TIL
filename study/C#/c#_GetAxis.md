GetAxis
=========
- Input.GetAxis는 GetButton, GetKey와 유사한 방식으로 작용
- GetButton과 GetKey는 버튼을 누르거나 누르지 않아도 bool을 반환한다.
- GetAxis는 -1과 1사이의 부동값을 반환
- 축 설정: Edit -> Project Settings -> Input
- 여기서는 버튼을 누를 때 양의 값만을 고려하지만 축은 양과 음의 값 둘다 고려함.
- Gravity, Dead, Sensitivity, Snap 도 함께 고려.