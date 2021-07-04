package com.company.allEnums.Users;


public class User_00 {
	public static void main(String[] args) {

		UserStatus myNewUser = new UserStatus();
		UserStatus.Status myUserStatus = UserStatus.Status.ACTIVE;

		myNewUser.getUserStatus(myUserStatus);
	}
}
