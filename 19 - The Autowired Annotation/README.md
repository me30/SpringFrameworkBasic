# context:annotation-config
context:annotation-config is used for activating annotations in beans already registered in the application context (no matter whether they were defined with XML or by package scanning). That means it will resolve @Autowired and @Qualifier annotations for the beans which are already created and stored in the spring container.

# context:component-scan
context:component-scan can also do the same job, but context:component-scan will also scan the packages for registering the beans to application context. context:annotation-config will not search for the beans registration, this will only activate the already registered beans in the context.

# @Autowired
The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.

# @Qualifier
@Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired.



# @Autowired, @Qualifier and @Resource

@Autowired can be used alone . If it is used alone , it will be wired by type . So problems arises if more than one bean of the same type are declared in the container as @Autowired does not know which beans to use to inject. As a result , use @Qualifier together with @Autowired to clarify which beans to be actually wired by specifying the bean name (wired by name)

@Resource is wired by name too . So if @Autowired is used together with @Qualifier , it is the same as the @Resource.

The difference are that @Autowired and @Qualifier are the spring annotation while @Resource is the standard java annotation (from JSR-250) . Besides , @Resource only supports for fields and setter injection while @Autowired supports fields , setter ,constructors and multi-argument methods injection.

It is suggested to use @Resource for fields and setter injection. Stick with @Qualifier and @Autowired for constructor or a multi-argument method injection.
