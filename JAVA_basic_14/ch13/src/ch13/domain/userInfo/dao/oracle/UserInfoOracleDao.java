package ch13.domain.userInfo.dao.oracle;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into ORACLE DB userID " + userinfo.getUserId());
		System.out.println("Insert into ORACLE DB userPW " + userinfo.getUserPW());

	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into ORACLE DB userID " + userinfo.getUserId());
		System.out.println("Update into ORACLE DB userPW " + userinfo.getUserPW());

	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete into ORACLE DB userID " + userinfo.getUserId());
		System.out.println("Delete into ORACLE DB userPW " + userinfo.getUserPW());

	}

}
