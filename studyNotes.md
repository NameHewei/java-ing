[toc]

# 学习笔记

- Java是将代码编译成一种“字节码”，它类似于抽象的CPU指令，然后，针对不同平台编写虚拟机，不同平台的虚拟机负责加载字节码并执行，这样就实现了“一次编写，到处运行”的效果;SUN公司制定了一系列的Java虚拟机规范;

- java se 是标准版，包含标准JVM和标准库； java ee 是企业版，加了大量的api和库，两者虚拟机一致；java me 针对嵌入式设备的“瘦身版”,几乎没有使用；

## 相关名词

- JVM: java virtual machine
- JDK：java development kit（套件）
- JRE：java runtime environment
- JSR规范：Java Specification Request
- JCP组织：Java Community Process

关系
```
  —— —— —— —— compiler，debugger， etc
 |
JDK —— 
 |    |
 |   JRE —— JVM + runtime library
 |    |
 |  ——

Windows | Linux │ macOS │ others 
```

## 安装JDK

- oracle官网 -> product -> developer tools -> java se jdk -> Downloads -> 选择最下方对应的版本下载

- 安装完后，在安装路径(默认`C:\Program Files\Java\jdk-12.0.2`) 中查看

- 将bin添加到环境变量


## JDK与JVM

- OpenJ9：高性能可伸缩的 Java 虚拟机，可作为 Hotspot 的替代者用于 OpenJDK

- HotSpot：是JVM（Java Virtual Machine），openJDK所包含

- OpenJDK：是一个完整的开发工具包，包含其他组件，如Java 类库以及 JVM

---
# 教程笔记：

源文件 -> 编译器 -> 字节码文件 -> 解释器

## 环境变量

JAVA_HOME 配置JDK安装路径 系统变量里新建(地址为jdk安装的根目录，如：D:\java)

---

PATH   配置JDK命令文件的位置  在path变量中编辑即可，D:\java\bin

---

**从java9开始可以不用配置**

CLASSPATH  配置库类文件的位置 系统变量里新建(地址为jdk安装的根目录，如：D:\java\lib)

---

验证环境变量配置是否正确  在命令行输入java 和javac 显示正确提示即配置正确

## 用记事本编写程序

1. 源代码文件 .java 文件
  - 可以直接运行 `java FirstStep.java` 

2. 使用javac命令编译 源代码文件，得到.class的字节码文件
  - 编写java文件 
  - 用javac编译: `javac FirstStep.java` ,生成同名.class文件

3. 解释器（不同的平台去解释字节码文件），使用java命令
  - java是解释class文件的解释器，是class的执行引擎
  - 执行字节码文件不需要加后缀名
  - `java FirstStep`(在cmd上执行报找不到类，在bash上正常)

## 使用IDE

1. 创建java项目
2. 创建程序包
3. 编写java源程序
4. 运行java程序(点击运行后编译器自动编译了)

