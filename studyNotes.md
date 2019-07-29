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

## 安装

- oracle官网 -> product -> java se jdk （developer） 下载

- 安装完后，在 `C:\Program Files\Java\jdk-12.0.2` 中查看

- 将其添加到环境变量


## JDK与JVM

- OpenJ9：高性能可伸缩的 Java 虚拟机，可作为 Hotspot 的替代者用于 OpenJDK

- HotSpot：是JVM（Java Virtual Machine），openJDK所包含

- OpenJDK：是一个完整的开发工具包，包含其他组件，如Java 类库以及 JVM