# OSChina
OSChina测试练习，使用Page Object设计模式设计测试用流利
设计思路：
1、com.oschina.base--->>存放页面封装元素
2、com.oschina.pom --->>存放页面相关操作，调用com.oschina.base中的类，组成各元素操作方法
3、com.oschina.test--->>存放测试用例，调用com.oschina.test中的方法类
