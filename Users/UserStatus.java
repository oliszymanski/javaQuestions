package com.company.allEnums.Users;

public class UserStatus {
	public enum Status {
		ACTIVE,				// user has been normally active
		ACTIVE_RECENTLY,	// user is recently active
		LAST_ACTIVE,		// user has seen last (time hrs:min)
		LONG_TIME_AGO		// user has been active long time ago
	}
}