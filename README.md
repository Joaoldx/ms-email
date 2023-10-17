# Send Email Micro Service API

change values or create enviroment variables to database and SMTP server for start using it

**application.properties**

```
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.mail.host=${EMAIL_HOST}
spring.mail.port=${EMAIL_PORT}
spring.mail.username=${EMAIL_USERNAME}
spring.mail.password=${EMAIL_PASSWORD}
```

To run application you can use this command or IDE

```
mvn spring-boot:run
```

Create HTTP Post to send email
```
http://localhost:8080/sending-email

{
    "ownerRef": "Alan",
    "emailFrom": "alan@company.com",
    "emailTo": "turing@company.com",
    "subject": "You are awesome",
    "text": "You can write huge text here"
}
```