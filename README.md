# ``Spring-Dependency-Injection``

# About
The core of the Spring Framework is based on the principle of Inversion of Control (IoC) (Dependency Injection). Applications that follow the IoC principle use configuration that describes the dependencies between its components.
There two type of Dependency Injection in Spring:
 - Constructor DI
 - Setter DI
Also, We can follow three approaches to implement Dependency Injection:
 - BASIC JAVA Annotation DI approach
 - XML Based Configuration DI approach
 - Automated Annotation DI approach

# Implementation Structure Model:
 > Service: Engine -> Implements(Electrical Engine, Combustion Engine)

 > Consumer: vehicle -> Implements(car, bike, auto rickshaw)

 > Client: runVehicle class

 > Configuration: DIConfiguration class

 > XML Configuration: applicationContext.xml


# Getting Started
- clone repository to IDE workspace (Ex. Eclipse)
``git clone https://github.com/FzArnob/Spring-Dependency-Injection.git``
- for Eclipse: Import as a maven project
``Eclipse > File > Import > Maven > Existing Maven Projects > Browse repository path in workspace > Finish``
- install project dependencies
``Project > Run as > Maven install``
- run project
``Project > Run as > Java Application``
