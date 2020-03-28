#### Windows 下配置 Antlr4
假设机器上已经安装并配置好了jdk

1 . 下载antlr4的jar包
[**antlr4**](https://www.antlr.org/download.html)

2 . 配置环境变量

新建一个文件夹用来存放下载好的jar包(或者本地有专门存放第三方jar包的目录)，
比如将下载下来的 antlr-4.8-complete.jar 放在 D:\java\lib\下.
在环境变量 CLASSPATH中将jar包的完整目录添加进去，也即
.;D:\java\lib\antlr-4.8-complete.jar;%**CLASSPATH**% (注意最开头的 **.;**)


3 . 创建脚本文件(.bat)

在antlr4的jar包存放的目录底下，新建 antlr.bat 和 grun.bat 两个文件，文件内容分别对应为

antlr.bat
```
java org.antlr.v4.Tool %*
```

grun.bat
```
java org.antlr.v4.gui.TestRig %*
```

4 . 配置PATH变量

为了后续方便使用anltr和grun这两个命令，可以将这两个文件所在目录（即 D:\java\lib）添加到PATH环境变量中去，这样在使用命令时就不需要每次都切换到所要操作的文件所在的目录了。