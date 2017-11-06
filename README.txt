1、spring 的三种注入方式
   （1）在boss中学习bean的@Autowired自动装配
   （2）在person中有bean的级联配置，内部bean
   （3）person2中新增list集合bean
    (4) person3中新增map集合bean
    (5) bean的作用域，singleton是指在sringIOC容器中，只有一个bean的实例存在；
        prototype指每次获取bean时都会产生一个新的bean实例
   （6）person4与Car2验证了构造器注入，与属性注入方式不同点：Car2要写构造函数
2、AOP连接点、切点、通知
    在math中练习AOP的前置、后置通知，切点函数
    切点的定义：可以用@Pointcut 定义一个切点方法
   避免重复在@Before @After中写切点函数，具体方法见math中的Advice类