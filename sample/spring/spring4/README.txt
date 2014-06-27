Sample 1: Shows how to use BeanFactory
Sample 2: Shows how to use ApplicationContext(with out ShutDown Hook)
Sample 3: Shows how to use ApplicationContext(with ShutDown Hook)
Sample 4: Constructor based dependecy setting
Sample 5: Setter based dependecy
Sample 6: Aliases sample
Sample 7: Example for Instantiation with a static factory method
Sample 8: Example for Instantiation with instance factory method
Sample 9: Example using depends-on
Sample 10: Example using lazy-init
Sample 11: Example init-method and destroy-methods

// Method injection :following samples shows the 3 ways to instantiate prototype bean at runtime in a singleton
Sample 12: Example demonstrating the use of ApplicationContextAware for Method injection
Sample 13: Example demonstrating the use lookup-method for Method injection
Sample 14: Example demonstrating the use method replacement for Method injection

Sample 15: Example demonstrating how to log in Spring with SLF4J and Logback
Sample 16: Example demonstrating Bean definition inheritance using parent
Sample 17: Example for autowiring by name
Sample 18: Example for autowiring by type
Sample 19: Example for autowiring constructor
Sample 20: Example for autowire-candidate set as false

//Customizing the nature of bean
Sample 21: Example for Startup and shutdown callbacks using SmartLifeCycle interface(call backs when applicationcontext starts/stops)
// initialization and destruction callback :following samples shows the 2 ways to initialization and destruction callback.Another 3rd way is using init-method and destroy-methods(sample 11)  
Sample 22: Example for initialization and destruction callbacks Using InitializingBean and DisposableBean(not recommended as it is strong coupling to spring)
Sample 23: Example for initialization and destruction callbacks using @PostConstruct and @PreDestroy annotations
Sample 24: Example showing the use of few Aware callbacks

//Container Extension Points
Sample 25: Example for BeanPostProcessor
Sample 26: Example for BeanFactoryPostProcessors

