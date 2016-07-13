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
