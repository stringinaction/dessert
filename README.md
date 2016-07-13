# dessert
第三章 Bean高级装配

###多个Config文件载入　
<pre>
  Config的Import可以逐级引用
  @Import(ProfileBeansConfig.class)
  @Import({ProProfileConfig.class, QaProfileConfig.class, DevProfileConfig.class})
</pre>

###Profile设定
<pre>
  @Profile("dev")
</pre>

###条件化的Bean
<pre>
  @Conditional(Conditional's child object .class)
</pre>

###问题点：
<pre>
不知道为什么@ActiveProfiles("dev")无法生效，只有在编译选项中加上  -Dspring.profiles.active="pro"　才有用
</pre>


###自动装配的歧义性处理:
<pre>
  @Primary  优先装配的Bean
  @Qualifier("自定义限定符")  只有在自动装配时有效
</pre>

##总结
###1 自动装配
<pre>
@Component  @Named
@ComponentScan
@Autowired  @Inject
@Primary
@Qualifier
</pre>

###2 JAVAConfig装配
<pre>
@Configuration
@Import
@Bean
@Profile
@ActiveProfiles
@Conditional
</pre>

###3 --XML装配--（非重点）

###4 作用域
####1 单例（Singleton），在Spring上下文时装配
####2 原型（Prototype），每次注入或能过Spring上下文时都创建一个Bean实例
####3 会话（Session）和请求（Request），在每个会话或请求时，运行过程中创建Bean实例

<pre>
@Scope()
</pre>

###5 运行时值注入

<pre>
@PropertySource("classpath:app.properties") //要放到resources目录下
@Value("${disc.title}") String title
@Value("#{'test'}") String artist
</pre>

