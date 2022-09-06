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

