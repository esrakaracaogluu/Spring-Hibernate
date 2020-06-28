package com.esra.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BenzinliMotor implements Motor {

	@Override
	public int getMotorHacmi() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public int getG�c() {
		// TODO Auto-generated method stub
		return 180;
	}

	@Override
	public int getTork() {
		// TODO Auto-generated method stub
		return 200;
	}

	public BenzinliMotor() {
		System.out.println("Benzinli motor olu�turuldu");
		System.out.println(this);

	}
}
