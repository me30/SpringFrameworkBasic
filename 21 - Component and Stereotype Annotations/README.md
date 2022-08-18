# @Component
@Component is an annotation that allows Spring to automatically detect our custom beans. In other words, without having to write any explicit code, Spring will: Scan our application for classes annotated with @Component. Instantiate them and inject any specified dependencies into them.

# context:annotation-config
context:annotation-config is used for activating annotations in beans already registered in the application context (no matter whether they were defined with XML or by package scanning). That means it will resolve @Autowired and @Qualifier annotations for the beans which are already created and stored in the spring container.

# context:component-scan
context:component-scan can also do the same job, but context:component-scan will also scan the packages for registering the beans to application context. context:annotation-config will not search for the beans registration, this will only activate the already registered beans in the context.
