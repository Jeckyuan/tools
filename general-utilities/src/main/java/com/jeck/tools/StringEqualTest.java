/**
 * @author Jeck
 * 
 * Create on 2018年5月25日 下午10:07:24
 */
package com.jeck.tools;

/**
 * 
 * 
 * 
 */
public class StringEqualTest
{
	public String st = "test";

	public static void main(String[] args)
	{
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s1.intern());
	}
}

