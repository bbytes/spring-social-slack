# spring-social-slack
Spring Social client implementation for slack.com

Usage 

Spring Social Security impl for http://slack.com oauth 2

Maven project setup: 

Add to pom.xml

```

		<repository>
			<id>spring-social-slack-bbytes</id>
			<url>https://raw.github.com/bbytes/spring-social-slack/mvn-repo/</url>
			<snapshots>
				<enabled>true</enabled>
				<updatePolicy>always</updatePolicy>
			</snapshots>
		</repository>
```

```
		<dependency>
			<groupId>org.springframework.social</groupId>
			<artifactId>spring-social-slack</artifactId>
			<version>${org.springframework.social.slack.version}</version>
		</dependency>
```

