# ApplicationContextAware
org.springframework.context.ApplicationContextAware interface, then the object instance of that class is provided with a reference to the ApplicationContext that it runs in.

ApplicationContextAware interface has a single method setApplicationContext with ApplicationContext as parameter.

ApplicationContextAware interface::

```java
public interface ApplicationContextAware {
   void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
```
By implementing the ApplicationContextAware interface a bean has access to the Spring's ApplicationContext so beans can manipulate programmatically the ApplicationContext that created them. Primary use of it is the programmatic retrieval of other beans using the application context.

# BeanNameAware

Interface to be implemented by beans that want to be aware of their bean name in a bean factory. Note that it is not usually recommended that an object depend on its bean name, as this represents a potentially brittle dependence on external configuration, as well as a possibly unnecessary dependence on a Spring API
