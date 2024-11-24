# Spring Security

## Step 1: Enable Spring Security

Add dependency to pom.xml:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-config</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-core</artifactId>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>

```

## Step 2: generate a Service class "JwtService"

It includes functions to generate JWT token from a secret key, expration, etc. It also includes function to extract username,
Claims, etc from a JWT token.

Here, it is in: Security/JwtService.java

## Step 3: