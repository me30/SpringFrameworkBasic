context:annotation-config is used for activating annotations in beans already registered in the application context (no matter whether they were defined with XML or by package scanning). That means it will resolve @Autowired and @Qualifier annotations for the beans which are already created and stored in the spring container.

context:component-scan can also do the same job, but context:component-scan will also scan the packages for registering the beans to application context. context:annotation-config will not search for the beans registration, this will only activate the already registered beans in the context.

The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.

@Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired.