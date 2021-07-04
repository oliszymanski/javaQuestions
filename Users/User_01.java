package com.company.allEnums.Users;


public class User_01 {

	public static void main(String[] args) {

		UserStatus myUser = new UserStatus();		// class object
		UserStatus.Status myUserStatus = UserStatus.Status.LAST_ACTIVE;


		myUser.getUserStatus(myUserStatus); 	// getting the user status

	}

}