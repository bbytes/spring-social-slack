# spring-social-slack
Spring Social client implementation for http://slack.com

Usage 


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
Note :   

Current version is 1.0.1-SNAPSHOT

Replace ${org.springframework.social.slack.version} with 1.0.1-SNAPSHOT in your maven pom file 

#Project status : 
Few operations (features) to be completed.

API list taken from  https://api.slack.com/methods

Pending features : 

pins api ,
reactions api ,
reminders api ,
search api ,
stars api ,

