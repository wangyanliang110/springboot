
@Copyright by SONG

Spring Boot

-- 20180403 --------------------------
00.微服务.Maven.Spring Boot
01.安装配置 MySQL,建库,建表,初始化数据
   安装设置 IntelliJ IDEA

02.IDEA 中 Spring Initializr工具,快速的构建出一个基础的Spring Boot/Cloud工程

   从 start.spring.io 下载 Maven Project 模板
   MyEclipse 导入 Maven Project



Spring Boot的基础结构共三个文件:
src/main/java  程序开发以及主程序入口
src/main/resources 配置文件
src/test/java  测试程序

03.pom.xml 中添加支持web的模块(依赖)
  <!-- 添加支持web的模块-->
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
04.controller
  YML文件格式是YAML (YAML Aint Markup Language)编写的文件格式，YAML是一种直观的能够被电脑识别的的数据数据序列化格式，并且容易被人类阅读，容易和脚本语言交互的，可以被支持YAML库的不同的编程语言程序导入，比如： C/C++, Ruby, Python, Java, Perl, C#, PHP等。

  采用yaml作为配置文件的格式。xml显得冗长，properties没有层级结构，yaml刚好弥补了这两者的缺点。
  这也是Spring Boot默认就支持yaml格式的原因

  application.yml 替换 application.properties
  # : 后必需有一个空格
  server:
    port: 8086

05.启动 Application
06.Chrome: http://127.0.0.1:8080/hello

07.设置 Tomcat 端口 (默认 8080)
08.www.getpostman.com 官网下载,安装 Postman - 测试
09.前后端分离开发,与前端联调

跨域是指 不同域名之间相互访问。跨域，指的是浏览器不能执行其他网站的脚本。它是由浏览器的同源策略造成的，是浏览器对JavaScript施加的安全限制

也就是如果在A网站中，我们希望使用Ajax来获得B网站中的特定内容
如果A网站与B网站不在同一个域中，那么就出现了跨域访问问题。

什么是同一个域？
同一协议，同一ip，同一端口，三同中有一不同就产生了跨域。


postman - controller - service
1.创建 Car 实体类
2.CarService.list() - 模拟数据
3.CarController.list()
4.postman



-- 20180404 ---------------------
thymeleaf 模板开发:
1.New Empty Project: thymeleaf
2.New Module – Spring Initializr – 勾选 Template Engines:Thymeleaf
3.修改 resources/application.properties
4.新建控制器 controller/ThymeleafController.java
5.新建模板 resources/templates/hello.html
6.修改 ThymeleafApplication.java
7.启动 ThymeleafApplication 浏览器查看效果



i18n 国际化开发步骤:
1.resources/i18n 下新建 messages.properties
2.在 resources/application.properties 中设置 i18n
3.新建 config/I18nConfig.java 设置 cookie 区域和拦截器
4.控制器
5.网页 expression.html
