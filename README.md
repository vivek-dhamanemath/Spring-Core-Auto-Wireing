# Spring Core Autowiring Project

## Overview
This project demonstrates the use of Spring Framework's autowiring feature to automatically wire dependencies into Spring-managed beans.

## Autowiring
Autowiring is a feature of the Spring Framework that automatically wires (or injects) dependencies into Spring-managed beans.
- With autowiring, you don't need to explicitly wire beans together in the Spring configuration file (XML) or through Java configuration.
- Instead, Spring automatically looks for beans of the required type and injects them into the dependent beans.
- There are 5 different types of autowiring:

1. **autowire - byName**
2. **autowire - byType**
3. **autowire - constructor**
4. **autowire - no**
5. **autowire - default**

### 1. autowire - byName
It is a type of autowiring which uses the setter injection to perform dependency injection.
- In this case, the variable name of the associated object declared in the owner class should be the same as that of the id specified in the bean tag.

### 2. autowire - byType
It is also a type of autowiring which uses the setter injection to perform dependency injection.
- In this case, the class name of a variable and class name given in a bean tag must be the same.
- Using autowire - byType, only one associated object of each type is injected inside the owner object.

### 3. autowire - constructor
It is a type of autowiring which uses the constructor injection to perform dependency injection.
- Here, this type of autowiring uses Constructor with the respective parameter to perform dependency injection for the associated objects into the owner object.

### 4. autowire - no
In this mode, no autowiring is performed. You have to inject beans explicitly by performing manual dependency injection in the Spring configuration file using `<property>` tag or `<constructor-arg>` tag.

### 5. autowire - default
- If the autowire attribute is specified as default, then it takes the value as no.
- It behaves exactly the same as autowire - no, and when we are using this, we have to inject beans explicitly by performing manual dependency injection in the Spring configuration file using `<property>` tag or `<constructor-arg>` tag.

## Project Structure

### Java Classes

#### Person.java
```java
package com.jsp.springcore.autowireing;

public class Person {

	private Bike bike;

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
}
```

#### Bike.java
```java
package com.jsp.springcore.autowireing;

public class Bike {
	// Bike properties and methods
}
```

### XML Configuration

#### applicationContext.xml
```xml
<!-- filepath: /e:/J Spider Basavangudi/Advance Java WorkSpace/Spring/Spring Core/SpringCoreAutowireing/src/main/resources/applicationContext.xml -->
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- Bean definitions and autowiring configurations -->

</beans>
```

## How to Run
1. Configure the Spring application context by updating the `applicationContext.xml` file.
2. Run the application to see the autowiring in action.
