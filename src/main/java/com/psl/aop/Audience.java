package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
public void audienceTakesSeats(){
System.out.println("audienceTakesSeats");
}
public void switchOffPhones(){
System.out.println("switchOffPhones");
}
public void demandRefund(){
System.out.println("demanding Refund");
}
public void applaud(){
System.out.println("clap clap clap!!!");
}
public void goHome(){
System.out.println("Audience go Homes");
}
public void watchPerformance(ProceedingJoinPoint jp)
{
	System.out.println("audienceTakesSeats");
	System.out.println("switchOffPhones");
	
	try
	{
	jp.proceed();//give control to point cut method
	}catch (Throwable e)
	{
		System.out.println("demanding Refund");
	}
	System.out.println("clap clap clap!!!");
	System.out.println("Audience go Homes");
}
}

