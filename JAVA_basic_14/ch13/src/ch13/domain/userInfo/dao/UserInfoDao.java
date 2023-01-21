package ch13.domain.userInfo.dao;

import ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {
// Dao 가 어떤 method 로 구성되어 있는지 알려주는 interface, 해당 값들을 참고해서 사용하면 된다
// Dao 의 추가가 일어날 경우, 현재 interface 를 implements 해서 method 를 모두 선언해주어야 한
	void insertUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
}
