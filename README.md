Master Branch : [![Build Status](https://travis-ci.org/chenkan/TestNgShow.png?branch=master)](https://travis-ci.org/chenkan/TestNgShow)

#### 概述

本项目目标是以实例展示`TestNG`的各项功能

Issue Link - https://github.com/chenkan/TestNgShow/issues

#### 版本

TestNG - 6.8.7

#### 实例 - Annotation运行顺序

用于演示TestNG各种Annotation所标记method的执行顺序

执行代码 - src/test/resources/basic.xml

参考链接 - http://testng.org/doc/documentation-main.html#annotations

请结合`basic.xml`与相应的测试用例及运行日志看

#### 实例 - 排除部分method

用例执行允许排除某个测试类里面的某个`@Test`method

Example Xml

* src/test/resources/exclude_method_in_package.xml
* 内含2个\<test\>，都运行同一个package，但其中一个<test>排除了一个`@Test`method
* 这2个\<test\>可对照着看
