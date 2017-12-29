package com.practice.optionalclass;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {

		//System.out.println(args[1]);

		List list = new ArrayList();
		
		list.add("Hello");
		list.add("world");
		
		System.out.println(list.get(0));
		
		list = null;
		
		System.out.println(list.get(1));
		
	}

	/**
	 * error Exception in thread "main"
	 * java.lang.ArrayIndexOutOfBoundsException: 1 at
	 * com.practice.optionalclass.Example.main(Example.java:8) ERROR: JDWP
	 * Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2 JDWP
	 * exit error AGENT_ERROR_NO_JNI_ENV(183): [util.c:840]
	 */

}
