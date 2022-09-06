# springboot-maven-archetype
## 项目简介
  以前创建springboot项目都是从头开始,费时费力。 通过maven archetype来创建一个springboot的简单项目模板,用来快速初始化项目。
## 制作maven archetype
### 正常创建springboot
  1. 本项目只是一个简单的springboot web项目,支持启动web服务。
  2. 支持连接mysql数据库以及mybatis plus。
  3. 项目机构为一个maven项目后面带两个子module,方便后期扩展。
### module定义
  模块只是为了方便初始化，简单项目只使用app即可。目前也只有app有代码。
  - api 定义项目需要对我提供的api model用。
  - app 项目启动入口及简单业务逻辑开发。
  - common 项目一些通用的封装。
  - sdk 项目需要对外提供的sdk。
## 利用maven archetype创建项目
### mvn archetype:create-from-project
  利用maven 插件先生成模板,在项目根目录下执行 mvn archetype:create-from-project
### install到本地
  从项目根目录开始,进入 target/generated-sources/archetype目录 执行命令 maven install
  安装之后会在本地目录生成一个文件  ~/.m2/repository/archetype-catalog.xml
<p/>

    ```<?xml version="1.0" encoding="UTF-8"?>
    <archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
    xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <archetypes>
    <archetype>
    <groupId>td.demo.springboot</groupId>
    <artifactId>springboot-template-archetype</artifactId>
    <version>1.0.0</version>
    <description>Parent pom providing dependency and plugin management for applications built with Maven</description>
    </archetype>
    </archetypes>
    </archetype-catalog>```

### 利用模板创建任务
mvn archetype:generate -DarchetypeCatalog=local  -DinteractiveMode=false  -DgroupId=com.luhaiyou.demo -DartifactId=oauth-github -Dversion=1.0.0-SNAPSHORT -DarchetypeArtifactId=springboot-template-archetype -DarchetypeVersion=1.0.0 -DarchetypeGroupId=td.demo.springboot -Dpackage=com.demo  
<p/>
参数说明:

   - archetypeCatalog=local 使用本地的 archetype模板.默认会是有maven central的模板 。
   - interactiveMode=false 是否是有交互模式
   - archetypeArtifactId=springboot-template-archetype archetype的构件id
   - archetypeVersion=1.0.0 archetype 版本号
   - archetypeGroupId=td.demo.springboot 组件groupId
   - groupId=com.luhaiyou.demo 新建项目的groupId
   - artifactId=oauth-github 新建项目的构件id
   - version=1.0.0-SNAPSHOT  版本号
   - package=com.demo  生成的代码的package 
