package com.spring.annotation.component;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{
	
	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker Volume Up");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker Volume Down");
	}
	
}
