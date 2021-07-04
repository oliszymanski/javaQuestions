package com.company.allEnums.Users;

import org.jetbrains.annotations.NotNull;

public class UserStatus {
	public enum Status {
		ACTIVE,				// user has been normally active
		ACTIVE_RECENTLY,	// user is recently active
		LAST_ACTIVE,		// user has seen last (time hrs:min)
		LONG_TIME_AGO		// user has been active long time ago
	}

	// method that gets status of the user
	void getUserStatus (@NotNull Status userStat) {
		switch (userStat) {
			case ACTIVE -> 			System.out.println("User is active");
			case ACTIVE_RECENTLY -> System.out.println("User is active recently");
			case LAST_ACTIVE -> 	System.out.println("User was last active...");
			case LONG_TIME_AGO -> 	System.out.println("User was active a long time ago");
		}
	}
}