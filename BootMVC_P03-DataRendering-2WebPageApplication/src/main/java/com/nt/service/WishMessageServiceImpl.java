package com.nt.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String wishMessage() {
		// get current hour of thr day
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		if (hour < 12)
			return "Good Morning";
		else if (hour < 16)
			return "Good Afternoon";
		else if (hour < 20)
			return "Good Evening";
		return "Good Night";
	}

}
