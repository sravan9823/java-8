package com.cgs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleApp {

	public static void main(String[] args) {
	/*	
		List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> collect = numbersList.stream().filter(num -> num%2!=0).collect(Collectors.toList());
		
		System.out.println(collect);
		Integer total = 0;
		for(Integer intValue : collect) {
			total += intValue;
		}
		
		System.out.println(total);*/
		
		//prime
		int number = 13,count=0;
		
		for(int i=1;i<=number;i++){
			if(number%i==0) {
				count++;
			}
		} 
		
		if(count<=2) {
			System.out.println("The number "+number+ " is Prime number");
		} else {
			System.out.println(number+ " is Not a Prime number");
		}
		

	}

}
