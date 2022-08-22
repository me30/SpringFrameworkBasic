we'll learn about the different types of bean scopes in the Spring framework.

The scope of a bean defines the life cycle and visibility of that bean in the contexts we use it.

The latest version of the Spring framework defines 6 types of scopes:

1) singleton : This scopes the bean definition to a single instance per Spring IoC container (default).

2) prototype : This scopes a single bean definition to have any number of object instances.
3) request : This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.

4) session : This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

5) global-session : This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
