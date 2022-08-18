# @Resource
The @Resource annotation in spring performs the autowiring functionality. This annotation follows the autowire=byName semantics in the XML based configuration i.e. it takes the name attribute for the injection. [its for JSR-250 Annotations] This annotation is part of Common Annotations API and it's part of JDK module javax.

# @PostConstruct
When we annotate a method in Spring Bean with @PostConstruct annotation, it gets executed after the spring bean is initialized. We can have only one method annotated with @PostConstruct annotation. This annotation is part of Common Annotations API and it's part of JDK module javax.

# @PreDestroy
A method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context. Same as with @PostConstruct, the methods annotated with @PreDestroy can have any access level, but can't be static. This annotation is part of Common Annotations API and it's part of JDK module javax.