package com.example;

public class StringReverse {
	   public String reverseString(String str){
	   
	      if(str.isEmpty()){
	         return str;
	      } else {
	         return reverseString(str.substring(1))+str.charAt(0);
	      }
	   }
	   public static void main(String[] args) {
	      StringReverse obj = new StringReverse();
	      String toBeReversed="a";
	      System.out.println("String to be reversed----"+toBeReversed); 
	      String result = obj.reverseString(toBeReversed);
	      System.out.println("String reversed---"+result);
	   }
	}
