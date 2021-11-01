package com.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class JUnitTest {
	@Test
	public void testIfListContainsElement() {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(3);
		integerList.add(5);
		integerList.add(4);
		integerList.add(8);
		integerList.add(9);
		integerList.add(10);

		List<Integer> element = new ArrayList<Integer>();
		element.add(1);
		element.add(9);
		element.add(10);
		assertTrue("List contains 1,9 and 10", integerList.containsAll(element));
	}

	@Test
	public void testKeyValuePair() {
		Map<Integer, Integer> pair = new HashMap<Integer, Integer>();
		pair.put(1000, 10000);
		pair.put(1011, 10000);
		pair.put(-1001, 10000);
		pair.put(1001, 10000);

		assertTrue("Map contains -1001:10000 key:value pair", pair.containsKey(-1001));

	}

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HemcrestTest {
	@Test
	public void testStringStartWithAndEndWith() {
		String str = "Shreshah";
		assertThat(str,startsWith("S"));
		assertThat(str, endsWith("h"));	
	}
	
	@Test
	public void testIfObjectReferenceIsNull() {
		Object obj = null;
		assertThat(obj, nullValue());
	}
	
	@Test
	public void testIfObjectReferenceIsNotNull() {
		Object obj = new Object();
		assertThat(obj, notNullValue());
	}

}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.junit.hemcrest</groupId>
  <artifactId>JUnitHemcrest</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>JUnitHemcrest</name>
  <build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jar-plugin</artifactId>
				<version>3.2.0</version>
				<executions>
					<execution>
						<goals>
							<goal>test-jar</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

	<reporting>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-report-plugin</artifactId>
				<version>2.19.1</version>
			</plugin>
		</plugins>
	</reporting>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/junit/junit -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all -->
		<dependency>
			<groupId>org.hamcrest</groupId>
			<artifactId>hamcrest-all</artifactId>
			<version>1.3</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
  
  
</project>
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------