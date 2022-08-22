The Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring.

You have learnt how to declare beans using the <bean> element and inject <bean> using <constructor-arg> and <property> elements in XML configuration file.
  
The Spring container can autowire relationships between collaborating beans without using <constructor-arg> and <property> elements, which helps cut down on the amount of XML configuration you write for a big Spring-based application.
 
# Autowiring Modes
  
Following are the autowiring modes, which can be used to instruct the Spring container to use autowiring for dependency injection. You use the autowire attribute of the <bean/> element to specify autowire mode for a bean definition.

no: It’s the default autowiring mode. It means no autowiring.

byName: The byName mode injects the object dependency according to name of the bean. In such a case, the property and bean name should be the same. It internally calls the setter method.

byType: The byType mode injects the object dependency according to type. So it can have a different property and bean name. It internally calls the setter method.

constructor: The constructor mode injects the dependency by calling the constructor of the class. It calls the constructor having a large number of parameters.

autodetect: In this mode, Spring first tries to autowire by the constructor. If this fails, it tries to autowire by using byType.
