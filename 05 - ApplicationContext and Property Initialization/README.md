# The ApplicationContext Interface
One of the main features of the Spring framework is the IoC (Inversion of Control) container. The Spring IoC container is responsible for managing the objects of an application. It uses dependency injection to achieve inversion of control.

The interfaces BeanFactory and ApplicationContext represent the Spring IoC container. Here, BeanFactory is the root interface for accessing the Spring container. It provides basic functionalities for managing beans.

On the other hand, the ApplicationContext is a sub-interface of the BeanFactory. Therefore, it offers all the functionalities of BeanFactory.

Furthermore, it provides more enterprise-specific functionalities. The important features of ApplicationContext are resolving messages, supporting internationalization, publishing events, and application-layer specific contexts. This is why we use it as the default Spring container.

# Spring Bean

ApplicationContext container, it's important to know about Spring beans. In Spring, a bean is an object that the Spring container instantiates, assembles, and manages.
ITs by xml file or by annotation 

# In line one ApplicationContext used and check all beans from xmlfile :
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
