package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into MySQL DB userID " + userinfo.getUserId());
		System.out.println("Insert into MySQL DB userPW " + userinfo.getUserPW());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into MySQL DB userID " + userinfo.getUserId());
		System.out.println("Uodate into MySQL DB userPW " + userinfo.getUserPW());

	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete into MySQL DB userID " + userinfo.getUserId());
		System.out.println("Delete into MySQL DB userPW " + userinfo.getUserPW());

	}

}
