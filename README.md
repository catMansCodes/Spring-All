# Spring Framework

All about Java spring framework with demo Projects. I hope my work will help you to improve your spring knowledge/concepts, Spring certification exam practice, crack an interview and find a good job.

<h2> List of Topics : </h2>

<ol>
  <li> Spring Core </li>
  <li> Spring MVC </li>
  <li> Spring Boot </li>
  <li> Spring AOP </li>
  <li> Spring Test </li>
  <li> Spring Data JPA </li>
  <li> Spring Rest </li>
  <li> Spring Security </li>
</ol>

<h3> Spring Framework Runtime </h3>

![](Runtime.PNG)

<h3> 1. Spring Core </h3>

<h4> What is the spring container?</h4>

Spring container is the core part of the spring framework. The container generally, Create the objects, wired them all together, configure them and manage their life cycle (creation to destroy)

<h4> Spring container configurations:</h4>

The most common ways to configure spring container are:

1. XML based configuration (old, famous & legacy way).
2. Java Annotations (the best and easy way)
3. Java Source code

<b> Development process is in simple steps </b>

1. Configure Spring beans
2. Create a Spring container
3. Retrieve beans from spring containers

<h4> XML based configuration </h4>

Step-01: Configure Spring beans

Create test.xml

```
<beans>
	 <bean id="demo" class="org.catmanscode.Test"></bean>
</beans>
```

Step-02: Create a Spring container (It is also known as ApplicatonContext)

Spring container/application contet can be create on multiple ways

1. ClassPathXmlApplicationContext
2. AnnotationConfigApplicationContext
3. GenericWebApplicationContext

Step-03: Retrieve beans from spring containers

![](SpringBeans.png)


